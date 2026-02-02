class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;              // pointer for odd nodes
        ListNode even = head.next;        // pointer for even nodes
        ListNode evenHead = even;         // store start of even list

        while (even != null && even.next != null) {
            odd.next = even.next;         // link odd to next odd
            odd = odd.next;               // move odd pointer

            even.next = odd.next;         // link even to next even
            even = even.next;             // move even pointer
        }

        odd.next = evenHead;              // attach even list after odd list
        return head;
    }
}
