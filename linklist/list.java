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

  static void findMidPoint(list l1) {
    node p = l1.h;
    node q = l1.h;
    while (q.next != null && q.next.next != null) {
      p = p.next;
      q = q.next.next;
    }
    System.out.println("The mid point of the given list is:-" + p.info);
  }

  static void sorting(list l1) {
    node p = l1.h;
    node q = l1.h.next;
    while (p.next != null) {
      while (q != null) {
        if (p.info > q.info) {
          int temp = p.info;
          p.info = q.info;
          q.info = temp;
          // System.out.println(p.info);
        }
        if (q.next != null)
          q = q.next;
        else
          break;
        // System.out.println(q.info);
      }
      p = p.next;
      // System.out.println(p.info);
      if (p.next != null)
        q = p.next;
      // System.out.println(q.info);
    }
    System.out.println("sorting");
    dis(l1);
  }

  static void keepNskip(list l1, int m, int n) {
    node a = l1.h;
    node b;
    int x, y;
    while (true) {
      x = 1;
      while (x < m && a.next != null) {
        System.out.println(" inf :  " + a.info);
        a = a.next;
        x++;
      }

      b = a.next;
      y = 1;
      while (y < n && b != null) {
        System.out.println(" Hi " + b.info);
        b = b.next;
        y++;
      }
      System.out.println(" next ");
      if (b != null) {
        a.next = b.next;
        a = b.next;
      } else {
        break;
      }
    }
    dis(l1);
    System.out.println();
  }

  static void nthEnd(list l1, int n) {
    node p = l1.h;
    node q = l1.h;
    int c = 0;
    while (q != null) {
      if (c != n) {
        q = q.next;
        c++;
      } else {
        p = p.next;
        q = q.next;
      }
    }
    System.out.println("The element is:-" + p.info);
  }

  static void findCommonElement(list l1) {
    node p = l1.h;

    int com = 0, k = 0, k1 = 0;

    if (p == null) {
      System.out.println("Not a valid LinkList");
      return;
    } else {
      node q = l1.h.next;
      while (q != null) {
        if (p.info == q.info) {
          k++;
          com = p.info;
          p = p.next;
          q = q.next;
        } else {
          if (k > 0) {
            System.out.println("The common Value:" + com + " Occurance" + (k + 1));
            k1 = 1;
            k = 0;
            com = 0;
          }
          p = p.next;
          q = q.next;
        }

      }
      if (k > 0) {
        System.out.println("The common Value:" + com + " Occurance" + (k + 1));
        k1 = 1;
        k = 0;
        com = 0;
      }
      if (k1 == 0) {
        System.out.println("No common elements found");
      }
    }
  }

  static void removeDuplicates(list l1) {

    node p = l1.h;
    // int f = 0;

    if (p == null) {
      return;
    }

    while (p != null) {
      node q = p.next;
      node prev = p;
      while (q != null) {
        if (p.info != q.info) {
          prev = prev.next;
          q = q.next;
        } else
          break;

      }
      prev = prev.next.next;
      p = p.next;
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
      System.out.println(
          "\n 6: mergeTwoSortedList , 7: finding mid node,8: Sorting linklist , 9:keep & skip ele ,10: find nth node from last ,11: Quit ");
      System.out.println(
          "\n 12:find common elements in a sorted linklist, 13:remove dublicate elements form an onordered linklist");
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
        case 7:
          System.out.println("press 1 for first list and 2 for second list");
          int in = input1.nextInt();
          if (in == 1) {
            findMidPoint(ls1);
          } else if (in == 2)
            findMidPoint(ls2);
          else
            findMidPoint(ls3);
          break;
        case 8:
          System.out.println("press 1 for first list and 2 for second list and 3 for the 3rd linkedList");
          int in2 = input1.nextInt();
          if (in2 == 1)
            sorting(ls1);

          else if (in2 == 2)
            sorting(ls2);

          else
            sorting(ls3);
          break;
        case 9:
          System.out.println(" Possible in 1st List only ");
          Scanner in1 = new Scanner(System.in);
          System.out.println(" enter no of ele to keep : ");
          int m = in1.nextInt();
          System.out.println(" enter no of ele to skip  : ");
          int n = in1.nextInt();
          keepNskip(ls1, m, n);
          dis(ls1);
          break;
        case 10:
          System.out.println("possible in 1st list ");
          Scanner in3 = new Scanner(System.in);
          System.out.println("Nth node from the end");
          int n1 = in3.nextInt();
          nthEnd(ls1, n1);

          break;
        case 11:
          return;

        case 12:
          System.out.println("possible in 1st list and if the linkedlist is sorted ");
          // sorting(ls1);
          findCommonElement(ls1);
          break;

        case 13:
          System.out.println("possible in 1st list and if the linkedlist is sorted ");
          removeDuplicates(ls1);
          break;
        default:
          System.out.println(" wrong choice : enter again : ");
          input1.close();
      }

    }
  }
}
