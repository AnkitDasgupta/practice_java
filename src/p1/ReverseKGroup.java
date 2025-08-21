package p1;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // Dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupEnd = dummy;
        ListNode current = head;

        while (true) {
           
            ListNode kth = getKthNode(current, k);
            if (kth == null) break;

            ListNode nextGroupStart = kth.next;

            ListNode prev = nextGroupStart;
            ListNode temp = current;
            while (temp != nextGroupStart) {
                ListNode next = temp.next;
                temp.next = prev;
                prev = temp;
                temp = next;
            }

            ListNode tempPrevGroupEnd = prevGroupEnd.next;
            prevGroupEnd.next = kth;
            prevGroupEnd = tempPrevGroupEnd;
            current = nextGroupStart;
        }

        return dummy.next;
    }

    private ListNode getKthNode(ListNode start, int k) {
        while (start != null && k > 1) {
            start = start.next;
            k--;
        }
        return start;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Input list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        ReverseKGroup solution = new ReverseKGroup();
        ListNode result = solution.reverseKGroup(head, k);

        System.out.println("Reversed in groups of " + k + ":");
        printList(result);  // Output: 2 -> 1 -> 4 -> 3 -> 5
    }
}
