package linklist;

import java.util.*;

public class find {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to be searched");
        int f = sc.nextInt();
        int p = printlist(head, f);
        if (p == 1)
            System.out.println(p);
        else
            System.out.println(p);
        sc.close();
    }

    static int printlist(Node head, int f) {

        if (head == null)
            return -1;
        if (head.data == f)
            return 1;
        else {
            int pos = printlist(head.next, f);
            if (pos == -1)
                return -1;
            else
                return (pos + 1);
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