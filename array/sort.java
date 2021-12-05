package array;

import java.util.*;

class sort {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(5);
        a.add(9);
        a.add(4);
        a.add(10);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
        Collections.sort(a, Collections.reverseOrder());
        System.out.println(a);

    }
}