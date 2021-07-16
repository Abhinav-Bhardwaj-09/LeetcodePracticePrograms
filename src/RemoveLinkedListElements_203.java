/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 16-07-2021
 * Time: 09:14
 */

public class RemoveLinkedListElements_203 {
    /**/
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)  {
            return head;
        }
        ListNode current = new ListNode(0);
        current.next = head;
        head = current;
        while(current !=null && current.next != null) {
            if(current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head.next;
    }
    /**/
}
