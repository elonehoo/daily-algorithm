# 每日算法

> **难度**  - > `中等`
>
> **日期** - > `2021年4月15日`
>
> **开始时间** - > `19:00`
>
> **结束时间** - > `19:33`
>
> **所用时间** - > `33分钟`
>
> **执行用时** - > `00 ms`
>
> **内存消耗** - > `36.2 MB`

## 题目

你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都 `围成一圈` ，这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警 。

给定一个代表每个房屋存放金额的非负整数数组，计算你 在不触动警报装置的情况下 ，能够偷窃到的最高金额。

**示例 1：**

```markdown
输入：nums = [2,3,2]
输出：3
解释：你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
```

**示例 2：**

```markdown
输入：nums = [1,2,3,1]
输出：4
解释：你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
     偷窃到的最高金额 = 1 + 3 = 4 。
```

**示例 3：**

```markdown
输入：nums = [0]
输出：0
```

**提示：**

```markdown
- 1 <= nums.length <= 100
- 0 <= nums[i] <= 1000
```

## 答案

```java
package com.algorithm.year2021.a1April.b13Fourteen.code;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/15 下午7:05
*/
public class Solution {
    /**
     * 打家劫舍 II
     * @author HCY
     * @since 2021/4/15 下午7:05
     * @param nums: 沿街的房屋
     * @return int
    */
    public int rob(int[] nums) {
        //长度为1直接返回值
        if(nums.length == 1){
            return nums[0];
        }else{
            //处理数组[0 -> len - 2]和[len - 1 -> 1]的数组即从左到右不包括最后值的数组和从右到左不包括第一个值的数组
            int[] nums1 = new int[nums.length - 1];
            int[] nums2 = new int[nums.length - 1];
            for(int i = 0; i < nums.length - 1; ++i){
                nums1[i] = nums[i];
                nums2[i] = nums[nums.length - 1 - i];
            }
            //返回两者的最大值
            return Math.max(singleTreatment(nums1), singleTreatment(nums2));
        }
    }
    public int singleTreatment(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; ++i){
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }


}
```