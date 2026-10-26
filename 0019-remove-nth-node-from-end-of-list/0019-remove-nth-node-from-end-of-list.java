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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode x= new ListNode(0,head);
        ListNode temp=x;
        ListNode fin=x;
        for(int i=0;i<=n;i++){
            fin=fin.next;
        }
            while(fin!=null){
                temp=temp.next;
                fin=fin.next;
            }
            temp.next=temp.next.next;
            return x.next;
    }
}