class Solution {

    Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    Node compute(Node head) {
        // Step 1: Reverse
        head = reverse(head);

        // Step 2: Delete nodes smaller than max so far
        Node curr = head;
        int max = curr.data;

        while (curr.next != null) {
            if (curr.next.data < max) {
                curr.next = curr.next.next; // delete
            } else {
                curr = curr.next;
                max = curr.data;
            }
        }

        // Step 3: Reverse back
        return reverse(head);
    }
}
