package linklist;

public class recur {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printlist(head);
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