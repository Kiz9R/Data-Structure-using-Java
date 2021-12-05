package array;

import java.util.*;

public class leader {
    public static int q = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        lead(arr, n);
        sc.close();
    }

    static void lead(int[] arr, int n) {
        int l = arr[n - 1];
        System.out.print(l + " ");
        for (int i = n - 2; i > 0; i--) {
            if (l < arr[i]) {
                l = arr[i];
                System.out.print(l + " ");
            }

        }
    }

}
