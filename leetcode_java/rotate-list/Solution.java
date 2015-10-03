public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int len = 0;
        ListNode tmp = head;
        while(tmp != null){
            tmp = tmp.next;
            len++;
        }
        if(len == 0) return head;
        k %= len;
        if(k == 0) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy, slow = dummy;
        while(fast.next != null && k > 0){
            fast = fast.next;
            k--;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        fast.next = head;
        try{
            return slow.next;
        }finally{
            slow.next = null;
        }
//        tmp = slow.next;
//        slow.next = null;
//        return tmp;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null) return null;
        
        int len = 1;
        
        ListNode tail = head;
        
        while(tail.next != null){
            len++;
            tail = tail.next;
        }
        
        tail.next = head; // cycle
        
        k %= len;
        
        for(int i = 1; i < len - k; i++){
            head = head.next;
        }
        
        try {
            return head.next;
        } finally {
            head.next = null; // cut
        }
        
    }
}
