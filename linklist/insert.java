package linklist;

public class insert {
    public static void main(String[] args) {
        Node head = null;

        head = printlist(head, 20);
        head = printlist(head, 30);
        // System.out.println(head.data);
        print(head);

    }

    static Node printlist(Node head, int f) {

        Node temp = new Node(f);
        if (head == null)
            return temp;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
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