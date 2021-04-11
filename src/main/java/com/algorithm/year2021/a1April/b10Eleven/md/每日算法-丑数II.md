# 每日算法

> **难度**  - > `中等`
>
> **日期** - > `2021年4月11日`
>
> **开始时间** - > `20:47`
>
> **结束时间** - > `21:02`
>
> **所用时间** - > `15分钟`
>
> **执行用时** - > `03 ms`
>
> **内存消耗** - > `37.2 MB`

## 题目

给你一个整数 n ，请你找出并返回第 n 个 丑数 。

丑数 就是只包含质因数 2、3 和/或 5 的正整数。

**示例 1：**

```markdown
输入：n = 10
输出：12
解释：[1, 2, 3, 4, 5, 6, 8, 9, 10, 12] 是由前 10 个丑数组成的序列。
```

**示例 2：**

```markdown
输入：n = 1
输出：1
解释：1 通常被视为丑数。
```

**提示：**

```markdown
1 <= n <= 1690
```

## 答案

```java
/**
 * 解决方案
 * @author HCY
 * @since 2021/4/11 下午8:51
*/
public class Solution {
    /**
     * 丑数II
     * @author HCY
     * @since 2021/4/11 下午8:51
     * @param n: 丑数
     * @return int
    */
    public int nthUglyNumber(int n) {
        int[] arr = new int[n];
        int a = 0;
        int b = 0;
        int c = 0;
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            arr[i]=Math.min(arr[a]*2,Math.min(arr[b]*3,arr[c]*5));
            if(arr[i]==arr[a]*2){a++;}
            if(arr[i]==arr[b]*3){b++;}
            if(arr[i]==arr[c]*5){c++;}
        }
        return arr[n];
    }
}
```