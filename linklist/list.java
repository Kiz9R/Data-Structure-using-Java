package linklist;

import java.util.Scanner;

class list {
  static class node {
    int info;
    node next;

    node(int i) {
      this.info = i;
      next = null;
    }

  }

  node h;

  static void insert(list l1, int i) {

    node n1 = new node(i);
    n1.next = null;
    if (l1.h == null) {
      // System.out.println(" 1st insert ");
      l1.h = n1;
    } else {

      node m;
      m = l1.h;
      while (m.next != null) {
        // System.out.println(" insert "+m.info);
        m = m.next;
      }

      m.next = n1;
    }
  }

  static void insertb(list l1, int i) {

    node p = new node(i);
    if (l1.h == null) {
      l1.h = p;
    } else {
      p.next = l1.h;
      l1.h = p;
    }
  }

  static void dis(list l1) {
    node m = l1.h;
    while (m != null) {
      System.out.print(m.info + "-->  ");
      m = m.next;

    }
    System.out.print("  ");

  }

  static void prinrev(node m) {

    if (m != null) {
      prinrev(m.next);
      System.out.print(m.info + "-->");
    } else {
      return;
    }

  }

  static void addlist(list l1, list l2) {
    node m = l1.h;
    node n = l2.h;
    while (m.next != null) {
      m = m.next;
    }
    m.next = n;
  }

  static int count(list l1) {
    int c = 0;
    node m = l1.h;
    while (m != null) {

      m = m.next;
      c++;
    }
    return (c);
  }

  static void check(list l1, list l2, int m, int n) {
    node p;
    node q;
    int f = 0;
    int d;
    if (m > n) {
      d = m - n;
      p = l1.h;
      f = 1;
    } else {
      d = n - m;
      p = l2.h;
    }
    if (f == 0)
      q = l1.h;
    else
      q = l2.h;
    System.out.println(" val : " + p.info + "  d is : " + d);
    while (d != 0) {
      p = p.next;
      d = d - 1;
    }
    System.out.println(" val : " + p.info);
    System.out.println(" val : " + q.info);
    while (p != null) {
      if (p.next == q.next) {
        System.out.println("  merged node : " + p.next.info);
        break;
      } else {
        p = p.next;
        q = q.next;
      }
    }

  }

  static void revDuplicateInSorted(list l1) {

    if (l1.h == null) {
      System.out.println(" No list ");
    } else {
      node prev = l1.h;
      node p = prev.next;
      while (p != null) {
        if (prev.info == p.info) {
          p = p.next;
        } else {
          prev.next = p;
          prev = p;
          p = p.next;
        }
      }
      prev.next = null;
    }
    System.out.println("\n\n  Done !! ");

  }

  static void mergeSortedTwoList(list l1, list l2, list r) {
    node p = l1.h;
    node q = l2.h;
    // list r=new list();
    while (p != null && q != null) {
      if (p.info < q.info) {
        insert(r, p.info);
        p = p.next;
      } else {
        insert(r, q.info);
        q = q.next;
      }
    }
    while (p != null) {
      insert(r, p.info);
      p = p.next;
    }
    while (q != null) {
      insert(r, q.info);
      q = q.next;
    }
  }

  public static void main(String a[]) {
    // int d;
    list ls1 = new list();
    list ls2 = new list();
    list ls3 = new list();
    list ls;
    list r = new list();

    Scanner input1 = new Scanner(System.in);
    int ch;

    while (true) {
      System.out.println(" \n\n 1: create, 2: insert at beg, 3: printReverse ");
      System.out.println("4: Merge & check,5: removeDuplicateInSortedList ");
      System.out.println("\n 6: mergeTwoSortedList ,  9:Quit ");
      ch = input1.nextInt();

      switch (ch) {
        case 1:
          System.out.println(" enter ele to insert : ");
          int ele1 = input1.nextInt();
          System.out.println(" enter list no  : ");
          int k = input1.nextInt();
          if (k == 1)
            ls = ls1;
          else if (k == 2)
            ls = ls2;
          else
            ls = ls3;
          insert(ls, ele1);
          dis(ls);
          break;
        case 2:
          System.out.println(" enter ele to insert : ");
          int ele2 = input1.nextInt();
          insertb(ls1, ele2);
          dis(ls1);
          break;
        case 3:
          prinrev(ls1.h);
          break;
        case 4:
          if (ls1.h != null && ls2.h != null && ls3.h != null) {
            addlist(ls1, ls3);
            dis(ls1);
            addlist(ls2, ls3);
            dis(ls2);
            int m = count(ls1);
            int n = count(ls2);
            System.out.println("  m : " + m + "  n : " + n);
            check(ls1, ls2, m, n);
          } else {
            System.out.println(" Not possible ");
          }
          break;
        case 5:
          System.out.println(" enter list no To remove duplicate in SORTED LIST : ");
          int k1 = input1.nextInt();
          if (k1 == 1)
            ls = ls1;
          else if (k1 == 2)
            ls = ls2;
          else
            ls = ls3;
          revDuplicateInSorted(ls);
          dis(ls);
          break;
        case 6:
          mergeSortedTwoList(ls1, ls2, r);
          dis(r);
          break;
        case 9:
          return;
        default:
          System.out.println(" wrong choice : enter again : ");
          input1.close();
      }

    }

  }
}
