package linklist;

import java.util.*;

public class order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int val = sc.nextInt();
        // Node head = null;
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head = ord(head, val);
        printlist(head);
        sc.close();
    }

    public static Node ord(Node head, int val) {
        Node temp = new Node(val);
        if (head == null)
            return temp;
        if (head.data > temp.data) {
            temp.next = head;
            head = temp;
            return head;
        }

        Node curr = head;

        while (curr.next != null && curr.next.data <= temp.data) {
            curr = curr.next;

        }
        if (curr.next == null) {
            curr.next = temp;
            return head;
        } else {
            temp.next = curr.next;
            curr.next = temp;
            return head;
        }

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
