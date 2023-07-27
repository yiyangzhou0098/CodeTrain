/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start

// Definition for singly-linked list.
// class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 设置进位符
        int carry = 0;

        ListNode newOne = new ListNode(0);
        // 设置虚拟头节点
        ListNode headOf = newOne;
        
        
        while(l1 != null || l2 != null || carry > 0){
            int value = carry;
            if(l1 != null){
                value = value + l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                value = value + l2.val;
                l2 = l2.next;
            }
            // 处理进位
            carry = value / 10;
            value = value % 10;

            // 设置新链表的值并指向下一个节点
            newOne.next = new ListNode(value);
            newOne = newOne.next;
        }

        return headOf.next;

    }
}
// @lc code=end

