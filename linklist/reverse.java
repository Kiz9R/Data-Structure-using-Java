package linklist;

public class reverse {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head = rev(head, null);
        printlist(head);
    }

    static Node rev(Node curr, Node prev) {

        if (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            return rev(next, curr);
        }
        return prev;
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
