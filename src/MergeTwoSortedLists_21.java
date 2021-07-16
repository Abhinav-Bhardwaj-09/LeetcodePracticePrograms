/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 16-07-2021
 * Time: 09:12
 */

public class MergeTwoSortedLists_21 {
    /**/
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
                current = current.next;
            }
            else {
                current.next = l2;
                l2 = l2.next;
                current = current.next;
            }
        }

        if (l1 == null) {
            current.next = l2;
        }

        else if (l2 == null) {
            current.next = l1;
        }


        return head.next;
    }
    /**/
}
