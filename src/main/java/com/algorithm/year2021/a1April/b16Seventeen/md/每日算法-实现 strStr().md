# 每日算法

> **难度**  - > `简单`
>
> **日期** - > `2021年4月20日`
>
> **开始时间** - > `08:55`
>
> **结束时间** - > `09:20`
>
> **所用时间** - > `25分钟`
>
> **执行用时** - > `01 ms`
>
> **内存消耗** - > `28.4 MB`

## 题目

实现 strStr() 函数。

给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。

**说明：**

```markdown
当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。

对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。
```

**示例 1：**

```markdown
输入：haystack = "hello", needle = "ll"
输出：2
```

**示例 2：**

```markdown
输入：haystack = "aaaaa", needle = "bba"
输出：-1
```

**示例 3：**

```markdown
输入：haystack = "", needle = ""
输出：0
```

**提示：**

```markdown
0 <= haystack.length, needle.length <= 5 * 104
haystack 和 needle 仅由小写英文字符组成
```

## 答案

```java
/**
 * 解决方案
 * @author HCY
 * @since 2021/4/20 8:53 上午
*/
public class Solution {

    /**
     * 实现 strStr() 函数。
     * 对于原生API的使用
     * @author HCY
     * @since 2021/4/20 8:53 上午
     * @param haystack: haystack
     * @param needle: needle
     * @return int
    */
    public int strStr_1(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    /**
     * 实现 strStr() 函数。
     * 暴力算法
     * @author HCY
     * @since 2021/4/20 8:55 上午
     * @param haystack: haystack
     * @param needle: needle
     * @return int
    */
    public static int strStr_2(String haystack, String needle) {
        int m = needle.length();
        if (m <= 0){ return 0; }
        int n = haystack.length();
        if (n <= 0){return -1;}
        for (int i = 0 ; (i + m) <= n ; i++){
            if (haystack.substring(i,i + m).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
    
}
```