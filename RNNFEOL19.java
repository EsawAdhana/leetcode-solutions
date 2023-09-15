// Question #19: Remove Nth Node From End of List
// Time complexity: O(n) && Space complexity: O(1)

class RNNFEOL19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < n; i++) {
            if (fast.next == null) return head.next;
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}
