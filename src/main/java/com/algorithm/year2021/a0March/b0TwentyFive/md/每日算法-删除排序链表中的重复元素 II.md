# 每日算法

> **难度**  - > `中等`
>
> **日期** - > `2021年3月25日`
>
> **开始时间** - > `19:55`
>
> **结束时间** - > `20:32`
>
> **所用时间** - > `37分钟`
>
> **执行用时** - > `1 ms`
>
> **内存消耗** - > `37.9 MB`

## 题目

### 中文

存在一个按升序排列的链表，给你这个链表的头节点 <kbd>head</kbd> ，请你删除链表中所有存在数字重复情况的节点，只保留原始链表中**没有重复出现**的数字。

返回同样按升序排列的结果链表。

**实例1**

![实例1](https://assets.leetcode.com/uploads/2021/01/04/linkedlist1.jpg)

**实例1输出**

```markdown
**输入**：head = [1,2,3,3,4,4,5]
**输出**：[1,2,5]
```

**实例2**

![实例2](https://assets.leetcode.com/uploads/2021/01/04/linkedlist2.jpg)

**实例2输出**

```markdown
**输入**：head = [1,1,1,2,3]
**输出**：[2,3]
```

**提示**

```markdown
- 链表中节点数目在范围 `[0, 300]` 内

- `-100 <= Node.val <= 100`

- 题目数据保证链表已经按升序排列
```

### 英文

Given the head of a <kbd>sorted</kbd> linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list **sorted** as well.

**Example 1:**

![Example 1](https://assets.leetcode.com/uploads/2021/01/04/linkedlist1.jpg)

**output result:**

```markdown
**Input**: head = [1,2,3,3,4,4,5]
**Output**: [1,2,5]
```

**Example 2:**

![Example 2](https://assets.leetcode.com/uploads/2021/01/04/linkedlist2.jpg)

**output result:**

```markdown
**Input**: head = [1,1,1,2,3]
**Output**: [2,3]
```

**Constraints:**

```markdown
- The number of nodes in the list is in the range [0, 300].

- -100 <= Node.val <= 100

- The list is guaranteed to be sorted in ascending order.
```

## 答案

```java
/**
 * 删除排序链表中的重复元素 II
 * Removes the duplicate element II in the sorted list
 * @author HCY
 * @since 2021/3/25 下午8:06
*/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        //如若 链表 为空 --> 则直接输出 null 。
      	//If the list is empty --> outputs null.
        if (head == null){
            return null;
        }
        //如若不为空 --> 则取出第一个
       	//If it is not empty --> fetches the first one
        ListNode node = new ListNode(0, head);
        ListNode cour = node;
        //循环判断是否重复
      	//The loop determines whether it is repeated
        while (cour.next != null && cour.next.next != null){
            //判断与下一个元素是否相等
          	//Determines if it is equal to the next element
           if (cour.next.val == cour.next.next.val){
               int x = cour.next.val;
               while (cour.next != null && cour.next.val == x){
                   cour.next = cour.next.next;
               }
           }else {
               cour = cour.next;
           }
        }
        return node.next;
    }
}
```

