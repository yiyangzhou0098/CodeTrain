/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//  Definition for singly-linked list.

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 虚拟头结点， *p = dummy, 设置p为指针
        ListNode dummy = new ListNode(-1), p = dummy;
        ListNode p1 = l1, p2 = l2;

        // 比较p1（从l1链表头节点开始）和p2（从l1链表头节点开始）的值
        while(p1 != null && p2 != null){
            // 如果p1小于p2，则dummy指向p1的值
            if (p1.val < p2.val){
                p.next = p1;
                p1 = p1.next;
            }

            else{
                p.next = p2;
                p2 = p2.next;
            }
            
            // p指针继续往后走，等待指向下一个节点
            p = p.next;
        }

        // 边界处理
        // 如果p2或p1已经指向null了即走到底了，dummy就直接取指向另一个剩余没走完的链表
        if (p1 != null){
            p.next = p1;
        }

        if (p2 != null){
            p.next = p2;
        }

        return dummy.next;
    }
}
// @lc code=end

