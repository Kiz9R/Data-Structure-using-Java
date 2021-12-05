package array;

import java.util.*;

public class differ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        diff(arr, n);
        sc.close();
    }

    static void diff(int[] arr, int n) {
        int k = 0, maxd = 0, f = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= k) {
                k = arr[i];
                f = i;
            }
        }
        for (int i = 0; i < f; i++) {
            if (maxd <= (k - arr[i])) {
                maxd = k - arr[i];
            }
        }
        System.out.println("The maximum diff " + maxd);
    }
}