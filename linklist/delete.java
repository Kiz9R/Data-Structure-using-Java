package linklist;

public class delete {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = del(head);
        print(head);

    }

    static Node del(Node head) {

        if (head == null)
            return null;
        if (head.next == null)
            return null;
        Node curr = head;
        while (curr.next.next != null)
            curr = curr.next;
        curr.next = null;
        return head;

    }

    static void print(Node head) {
        if (head != null) {
            System.out.println(head.data);
            print(head.next);
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