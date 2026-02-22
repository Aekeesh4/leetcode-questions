class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Split list into two halves
        ListNode mid = getMiddle(head);
        ListNode rightHead = mid.next;
        mid.next = null;  // break the list

        // Step 2: Recursively sort both halves
        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        // Step 3: Merge sorted halves
        return merge(left, right);
    }

    private ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;  // important!

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return dummy.next;
    }
}