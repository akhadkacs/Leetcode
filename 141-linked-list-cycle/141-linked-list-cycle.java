/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        /**
        Set<ListNode> set = new HashSet<>();
        
        while(head != null){
            if(set.contains(head)){
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
        */
        
        if(head ==null)
            return false;
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(slow!=fast){
            if(fast==null || fast.next==null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return true;
    }
}


