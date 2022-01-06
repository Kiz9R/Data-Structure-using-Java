package linklist;

import java.util.Scanner;

class dlist {
    static class dnode {
        int info;
        dnode prev;
        dnode next;

        dnode(int i) {
            this.info = i;
            next = null;
            prev = null;
        }

    }

    dnode h;

    static void insert(dlist l1, int i) {

        dnode n1 = new dnode(i);

        if (l1.h == null) {
            // System.out.println(" 1st insert ");
            l1.h = n1;
        } else {

            dnode m;
            m = l1.h;
            while (m.next != null) {

                m = m.next;
            }

            m.next = n1;
            n1.prev = m;
        }
    }

    static void dis(dlist l1) {
        dnode m = l1.h;
        while (m != null) {
            System.out.print(m.info + "-->  ");
            m = m.next;

        }
        System.out.print("  ");

    }

    static void insertbeg(dlist l1, int i) {
        dnode n1 = new dnode(i);

        if (l1.h == null) {
            l1.h = n1;
        } else {

            n1.next = l1.h;
            l1.h.prev = n1;
            l1.h = n1;
        }
    }

    static void spcInsert(dlist l1, int ele2, int ele3) {
        int f = 0;
        dnode n = new dnode(ele2);
        dnode curr = l1.h;

        if (l1.h == null) {
            System.out.println("\n Given linked list does not exist so the new list is:-");

            l1.h = n;
        }

        else {
            while (curr != null) {
                if (curr.info == ele3) {
                    f = 1;
                    if (curr.next == null) {
                        curr.next = n;
                        n.prev = curr;
                    } else {
                        n.next = curr.next;
                        curr.next.prev = n;
                        n.prev = curr;
                        curr.next = n;
                    }
                    break;
                } else {
                    curr = curr.next;
                }
            } // end while
            if (f == 0) {
                System.out.println("  specified element is not present ");
            }
        }
    }

    static void swapNthnodeFromBothEnd(dlist ls1, int k) {
        dnode p;
        dnode q;
        dnode t;
        dnode p1, p2, q1, q2;
        p = q = t = ls1.h;
        if (ls1.h == null) {
            System.out.println("  Linked list not present ");
        } else {
            int i = 1, f = 0;
            while (p != null) {
                if (i != k) {

                    p = p.next;
                    t = t.next;
                    i++;
                } else {
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                System.out.println("  n exceeds list length ");
                return;
            }
            // System.out.println(" first loop: "+t.info);
            while (t.next != null) {
                t = t.next;
                q = q.next;
            }
            // System.out.println(" end loop: "+q.info);
            if (p == q) {
                System.out.println(" No need to swap, as same node ");
                return;
            }
            if (p.prev == null && q.next == null || q.prev == null && p.next == null) {
                p.prev = q.prev;
                q.next = p.next;

                q.prev.next = p;
                p.next.prev = q;

                p.next = null;
                q.prev = null;
                System.out.println("p=" + p.next + "and" + p.prev.info + " q=" + q.prev + "and" + q.next.info);
                ls1.h = q;

            } else {
                p1 = p.prev;
                p2 = p.next;
                q1 = q.prev;
                q2 = q.next;

                p1.next = q;
                q.prev = p1;
                q.next = p2;
                p2.prev = q;

                q1.next = p;
                p.prev = q1;
                p.next = q2;
                q2.prev = p;
            }

        }
    }

    public static void main(String a[]) {
        // int d,n;
        dlist ls1 = new dlist();

        Scanner input1 = new Scanner(System.in);
        int ch;

        while (true) {
            System.out.println(" \n\n 1: create, 2: insert at beg,3: insert at specific location,");
            System.out.println(" \n\n 4:swap nth node from both end , 10: Quit ");

            ch = input1.nextInt();

            switch (ch) {
                case 1:
                    System.out.println(" enter ele to insert : ");
                    int ele1 = input1.nextInt();
                    insert(ls1, ele1);
                    dis(ls1);
                    break;
                case 2:
                    System.out.println(" enter ele to insert : ");
                    ele1 = input1.nextInt();
                    insertbeg(ls1, ele1);
                    dis(ls1);
                    break;
                case 3:
                    System.out.println("Enter the element you want insert");
                    int ele2 = input1.nextInt();
                    System.out.println("After which element you want to insert");
                    int ele3 = input1.nextInt();
                    spcInsert(ls1, ele2, ele3);
                    dis(ls1);
                    break;
                case 4:
                    System.out.println("Enter the nth postion to swap the nodes:");
                    int n = input1.nextInt();
                    swapNthnodeFromBothEnd(ls1, n);
                    dis(ls1);
                    break;
                case 10:
                    return;
                default:
                    System.out.println(" wrong choice : enter again : ");

            }

        }
    }
}
