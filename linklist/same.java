package linklist;

public class same {
    public static void main(String[] args) {

        // Node head = null;
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head = ord(head);
        printlist(head);

    }

    public static Node ord(Node head) {

        if (head == null)
            return head;

        Node curr = head;
        while (curr.next != null) {
            if (curr.data == curr.next.data) {
                if (curr.next.next != null) {
                    curr.next = curr.next.next;
                    curr = curr.next;
                } else {
                    curr.next = null;
                }
            } else
                curr = curr.next;
        }
        return head;

    }

    static void printlist(Node head) {
        if (head != null) {
            System.out.println(head.data);
            printlist(head.next);
        }
    }

}

// class Node {
// int data;
// Node next;

// Node(int x) {
// data = x;
// next = null;
// }
// }