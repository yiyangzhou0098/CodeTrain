/*
 * @lc app=leetcode id=86 lang=java
 *
 * [86] Partition List
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
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode front = new ListNode(-1), return_list = front;
        ListNode behind = new ListNode(-1), dummy = behind; 


        while(head != null){
            // 错误二：没有读清题目，要求大于或等于x的节点在x后面
            if(head.val < x){
                front.next = head;
                front = front.next;
            }else{
                behind.next = head;
                behind = behind.next;
            }
            // *错误一：一开始没有删除head原链表中的节点，导致环状链表
            // 断开原链表中每个节点的next指针值 ** 不断开的话连接的head原链表仍存在，会形成环状链表
            ListNode temp = head.next;
            head.next = null;
            head = temp;
        }
        // 错误四：前一个链表连接后一个时，需要连接的是原链表的头节点引用的next
        front.next = dummy.next;
        // 错误三：没有返回目标链表头节点(为小于原链表的所有节点故设为-1)的下一个节点
        return return_list.next;
    }
}
// @lc code=end

