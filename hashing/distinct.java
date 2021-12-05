package hashing;

import java.util.*;

public class distinct {
    public static void main(String[] args) {
        HashSet<Integer> distinct = new HashSet<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            distinct.add(sc.nextInt());
        }
        System.out.println(distinct.size());

        sc.close();
    }
}
