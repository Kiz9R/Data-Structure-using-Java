package array;

import java.util.*;

public class one {
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
        zero(arr, n);

        sc.close();
    }

    static void zero(int arr[], int n) {
        int k = 0, s = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1)
                k++;
            else
                k = 0;
            if (s < k)
                s = k;

        }
        System.out.println("The no of cons ones:-" + " " + s);
    }
}