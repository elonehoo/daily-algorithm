# 每日算法

> **难度**  - > `中等`
>
> **日期** - > `2021年3月31日`
>
> **开始时间** - > `15:06`
>
> **结束时间** - > `16:18`
>
> **所用时间** - > `72分钟`
>
> **执行用时** - > `01 ms`
>
> **内存消耗** - > `38.1 MB`

## 题目

### 中文

给你一个整数数组 <kbd>nums</kbd> ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。

解集 **不能** 包含重复的子集。返回的解集中，子集可以按 **任意顺序** 排列。

**实例1:**

```markdown
**输入**：nums = [1,2,2]
**输出**：[[],[1],[1,2],[1,2,2],[2],[2,2]]
```

**实例2:**

```markdown
**输入**：nums = [0]
**输出**：[[],[0]]
```

**提示**

```markdown
- 1 <= nums.length <= 10
- -10 <= nums[i] <= 10
```

## 答案

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 解决方案
 * @author HCY
 * @since 2021/3/31 下午2:58
*/
public class Solution {
    /**
     * 在集合中找子集
     * @author HCY
     * @since 2021/3/31 下午3:19
     * @param nums: 整数集合
     * @return java.util.List<java.util.List<java.lang.Integer>>
    */
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(new ArrayList<>());
        if(nums == null || nums.length == 0) {
            return resultList;
        }
        Arrays.sort(nums);


        List<Integer> templeList = new ArrayList<>();
        templeList.add(nums[0]);
        resultList.add(templeList);
        if(nums.length == 1) {
            return resultList;
        }

        int lastLen = 1;

        for(int i = 1; i < nums.length; i++){
            int size = resultList.size();
            if(nums[i] != nums[i-1]){
                lastLen = size;
            }

            for(int j = size - lastLen; j < size; j++){
                List<Integer> inner = new ArrayList(resultList.get(j));
                inner.add(nums[i]);
                resultList.add(inner);
            }
        }
        return resultList;
    }
}
```

