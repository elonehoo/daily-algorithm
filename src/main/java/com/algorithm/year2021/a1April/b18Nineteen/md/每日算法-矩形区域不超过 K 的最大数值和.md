# 每日算法

>**难度**  - > `困难`
>
>**日期** - > `2021年4月22日`
>
>**开始时间** - > `09:56`
>
>**结束时间** - > `12:10`
>
>**所用时间** - > `244分钟`
>
>**执行用时** - > `109 ms`
>
>**内存消耗** - > `38.5 MB`

## 题目

给你一个 m x n 的矩阵 matrix 和一个整数 k ，找出并返回矩阵内部矩形区域的不超过 k 的最大数值和。

题目数据保证总会存在一个数值和不超过 k 的矩形区域。

 ![wtOKU.jpg](https://i.im5i.com/2021/04/22/wtOKU.jpg)

**示例 1：**

```markdown
输入：matrix = [[1,0,1],[0,-2,3]], k = 2
输出：2
解释：蓝色边框圈出来的矩形区域 [[0, 1], [-2, 3]] 的数值和是 2，且 2 是不超过 k 的最大数字（k = 2）。
```

**示例 2：**

```markdown
输入：matrix = [[2,2,-1]], k = 3
输出：3
```

**提示：**

```markdown
m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-100 <= matrix[i][j] <= 100
-105 <= k <= 105
```

## 答案

```java
/**
 * 解决方案
 * @author HCY
 * @since 2021/4/22 9:59 上午
*/
public class Solution {
    

    /**
     * 矩形区域不超过 K 的最大数值和
     * @author HCY
     * @since 2021/4/22 9:59 上午
     * @param matrix: m x n 的矩阵
     * @param k: 整数 k
     * @return int
    */
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int rows = matrix.length, cols = matrix[0].length, max = Integer.MIN_VALUE;
        // O(cols ^ 2 * rows)
        // 枚举左边界
        for (int l = 0; l < cols; l++) {
            // 左边界改变才算区域的重新开始
            int[] rowSum = new int[rows];
            // 枚举右边界
            for (int r = l; r < cols; r++) {
                // 按每一行累计到 dp
                for (int i = 0; i < rows; i++) {
                    rowSum[i] += matrix[i][r];
                }

                // 求 rowSum 连续子数组 的 和
                // 和 尽量大，但不大于 k
                max = Math.max(max, dpmax(rowSum, k));
            }
        }
        return max;

    }

    private int dpmax(int[] rowSum, int k) {
        int rollSum = rowSum[0], rollMax = rollSum;
        // O(rows)
        for (int i = 1; i < rowSum.length; i++) {
            if (rollSum > 0) {
                rollSum += rowSum[i];
            } else {
                rollSum = rowSum[i];
            }
            if (rollSum > rollMax) {
                rollMax = rollSum;
            }
        }
        if (rollMax <= k) {
            return rollMax;
        }
        // O(rows ^ 2)
        int max = Integer.MIN_VALUE;
        for (int l = 0; l < rowSum.length; l++) {
            int sum = 0;
            for (int r = l; r < rowSum.length; r++) {
                sum += rowSum[r];
                if (sum > max && sum <= k) {
                    max = sum;
                }
                // 尽量提前
                if (max == k) {
                    return k;
                }
            }
        }
        return max;

    }
}
```