// Question #143: Reorder List
// Time complexity: O(n) && Space complexity: O(1)

class RL143 {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow.next;
        slow.next = null;

        mid = reverse(mid);

        while(mid != null) {
            ListNode tmp1 = head.next;
            ListNode tmp2 = mid.next;

            head.next = mid;
            mid.next = tmp1;

            head = tmp1;
            mid = tmp2;
        }
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
