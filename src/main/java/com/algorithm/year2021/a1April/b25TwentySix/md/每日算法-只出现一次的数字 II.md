# 每日算法

> **难度**  - > `中等`
>
> **日期** - > `2021年4月30日`
>
> **开始时间** - > `15:38`
>
> **结束时间** - > `15:42`
>
> **所用时间** - > `04分钟`
>
> **执行用时** - > `6 ms`
>
> **内存消耗** - > `37.9 MB`

## 题目

给你一个整数数组 nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。请你找出并返回那个只出现了一次的元素。

**示例 1：**

```markdown
输入：nums = [2,2,3,2]
输出：3
```

**示例 2：**

```markdown
输入：nums = [0,1,0,1,0,1,99]
输出：99
```

**提示：**

```markdown
1 <= nums.length <= 3 * 104
-231 <= nums[i] <= 231 - 1
nums 中，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次
```

**进阶：**

```markdown
你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
```

## 答案

```java
import java.util.HashMap;
import java.util.Map;

/**
 * 解决方案
 * @author HCY
 * @since 2021/4/30 3:30 下午
*/
public class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        for (Integer integer : map.keySet()) {
            if (map.get(integer) == 1){
                return integer;
            }
        }
        return -1;
    }
}
```