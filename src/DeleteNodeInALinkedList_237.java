/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 16-07-2021
 * Time: 09:16
 */

public class DeleteNodeInALinkedList_237 {
    /**/
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    /**/
}
