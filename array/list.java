package array;

import java.util.*;

public class list {
    public static int q = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements in array list");
        ArrayList<Integer> ar = new ArrayList<>();
        int n = 10;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            ar.add(a);
        }
        System.out.println(ar);
        sc.close();
    }
}
