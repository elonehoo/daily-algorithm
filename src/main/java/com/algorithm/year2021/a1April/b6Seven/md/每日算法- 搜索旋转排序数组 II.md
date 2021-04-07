# 每日算法

> **难度**  - > `中等`
>
> **日期** - > `2021年4月07日`
>
> **开始时间** - > `08:02`
>
> **结束时间** - > `08:07`
>
> **所用时间** - > `05分钟`
>
> **执行用时** - > `00 ms`
>
> **内存消耗** - > `38.1 MB`

## 题目

已知存在一个按非降序排列的整数数组 nums ，数组中的值不必互不相同。

在传递给函数之前，`nums` 在预先未知的某个下标 `k（0 <= k < nums.length）`上进行了 旋转 ，使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。例如， [0,1,2,4,4,4,5,6,6,7] 在下标 5 处经旋转后可能变为 [4,5,6,6,7,0,1,2,4,4] 。

给你 旋转后 的数组 nums 和一个整数 target ，请你编写一个函数来判断给定的目标值是否存在于数组中。如果 nums 中存在这个目标值 target ，则返回 true ，否则返回 false 。 

**示例 1：**

```markdown
**输入**：nums = [2,5,6,0,0,1,2], target = 0
**输出**：true
```

**示例 2：**

```markdown
**输入**：nums = [2,5,6,0,0,1,2], target = 3
**输出**：false
```

**提示：**

```markdown
- 1 <= nums.length <= 5000
- -104 <= nums[i] <= 104
- 题目数据保证 nums 在预先未知的某个下标上进行了旋转
- -104 <= target <= 104
```

**进阶：**

```markdown
- 这是 搜索旋转排序数组 的延伸题目，本题中的 nums  可能包含重复元素。
- 这会影响到程序的时间复杂度吗？会有怎样的影响，为什么？
```

## 答案

```java
/**
 * 解决方案
 * @author HCY
 * @since 2021/4/7 上午8:05
*/
public class Solution {
    /**
     * 搜索旋转排序数组 II
     * @author HCY
     * @since 2021/4/7 上午8:05
     * @param nums: 反转后的数组
     * @param target: 目标值
     * @return boolean
    */
    public boolean search(int[] nums, int target) {
        for (int num : nums) {
            if (target == num){
                return true;
            }
        }
        return false;
    }
}
```

