public class Problem0876 {
    public static void main(String[] args) {
        /*
            Given the head of a singly linked list, return the middle node of the linked list.
            If there are two middle nodes, return the second middle node.
        */
        int[] numbers = {1,3,7,4};
        ListNode head = new ListNode(numbers);

        System.out.println("Solution for the given input is: " + findMiddleNode(head).val);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int[] ints) {
            if (ints == null || ints.length == 0) {
                throw new IllegalArgumentException("Array cannot be null or empty");
            }
            this.val = ints[0];
            ListNode current = this;
            for (int i = 1; i < ints.length; i++) {
                current.next = new ListNode(ints[i]);
                current = current.next;
            }
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private static ListNode findMiddleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}