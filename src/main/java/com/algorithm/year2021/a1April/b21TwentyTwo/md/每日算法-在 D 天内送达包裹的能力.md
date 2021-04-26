# 每日算法

>**难度**  - > `中等`
>
>**日期** - > `2021年4月26日`
>
>**开始时间** - > `09:51`
>
>**结束时间** - > `10:42`
>
>**所用时间** - > `51分钟`
>
>**执行用时** - > `14 ms`
>
>**内存消耗** - > `41.5 MB`

## 题目

传送带上的包裹必须在 D 天内从一个港口运送到另一个港口。

传送带上的第 i 个包裹的重量为 weights[i]。每一天，我们都会按给出重量的顺序往传送带上装载包裹。我们装载的重量不会超过船的最大运载重量。

返回能在 D 天内将传送带上的所有包裹送达的船的最低运载能力。

**示例 1：**

```markdown
输入：weights = [1,2,3,4,5,6,7,8,9,10], D = 5
输出：15
解释：
船舶最低载重 15 就能够在 5 天内送达所有包裹，如下所示：
第 1 天：1, 2, 3, 4, 5
第 2 天：6, 7
第 3 天：8
第 4 天：9
第 5 天：10

请注意，货物必须按照给定的顺序装运，因此使用载重能力为 14 的船舶并将包装分成 (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) 是不允许的。 
```

**示例 2：**

```markdown
输入：weights = [3,2,2,4,1,4], D = 3
输出：6
解释：
船舶最低载重 6 就能够在 3 天内送达所有包裹，如下所示：
第 1 天：3, 2
第 2 天：2, 4
第 3 天：1, 4
```

**示例 3：**

```markdown
输入：weights = [1,2,3,1,1], D = 4
输出：3
解释：
第 1 天：1
第 2 天：2
第 3 天：3
第 4 天：1, 1
```

**提示：**

```markdown
1 <= D <= weights.length <= 50000
1 <= weights[i] <= 500
```

## 答案

```java
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/26 10:16 上午
*/
public class Solution {
    /**
     * 在 D 天内送达包裹的能力
     * 二分查找
     * @author HCY
     * @since 2021/4/26 10:16 上午
     * @param weights: 包裹的重量
     * @param D: D 天
     * @return int
    */
    public int shipWithinDays(int[] weights, int D) {
        //获取最大值
        int left = Arrays.stream(weights).max().getAsInt();
        //获取数组总和
        int right = 0;
        for (int weight : weights) {
            right += weight;
        }
        int ans = 0;
        for (; left < right ;){
            ans = (left + right) >> 1;
            int sum = 0;
            int flag = 0;
            for (int i = 0; i < weights.length; i++) {
                sum += weights[i];
                if (sum > ans) {
                    sum = weights[i];
                    flag++;
                    if(flag + 1 > D){
                        break;
                    }
                }
            }
            if (flag + 1 > D){
                left = ans + 1;
            }else {
                right = ans;
            }
        }
        return left;
    }
}
```

