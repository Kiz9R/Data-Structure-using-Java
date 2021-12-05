package linklist;

import java.util.*;

public class insertdata {
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position and the value");
        int p = sc.nextInt();
        int v = sc.nextInt();

        head = ins(head, p, v);
        print(head);
        sc.close();
    }

    static Node ins(Node head, int p, int v) {

        Node curr = head;
        Node temp = new Node(v);
        if (p == 1) {
            temp.next = head;
            return temp;
        }
        for (int i = 1; i <= p - 2 && curr != null; i++)
            curr = curr.next;
        if (curr == null)
            return head;
        temp.next = curr.next;
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