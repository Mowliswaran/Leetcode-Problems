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
    public ListNode rotateRight(ListNode head, int k) {
        int s=0;
        ListNode h=head;
        ListNode one=new ListNode();
        ListNode two=new ListNode();
        ListNode oh=null;
        ListNode ot=null;
        ListNode th=null;
        ListNode tt=null;
        while(head!=null){
            s++;
            head=head.next;
        }
        int t=-1;
        while(h!=null){
            t++;
            if(t<s-(k%s)){
                one=new ListNode(h.val);
                if(oh==null){
                    oh=one;
                    ot=one;
                }
                else{
                    ot.next=one;
                    ot=ot.next;
                }
            }
            else{
                two=new ListNode(h.val);
                if(th==null){
                    th=two;
                    tt=two;
                }
                else{
                    tt.next=two;
                    tt=tt.next;
                }
            }
            h=h.next;
        }
        if(oh==null){
            return th;
        }
        if(th==null){
            return oh;
        }
        tt.next=oh;
        return th;
    }
}