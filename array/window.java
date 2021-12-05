package array;

import java.util.*;

public class window {
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
        System.out.println("Enter the consiqutive number: ");
        int b = sc.nextInt();
        zero(arr, n, b);

        sc.close();
    }

    static void zero(int[] arr, int n, int b) {
        int res = 0, j = 1, sum = 0, k = 0;
        for (int i = 0; i < n; i++) {
            if (k < b) {
                sum += arr[i];
                k++;
                continue;
            }
            if (res < sum) {
                res = sum;
            }
            sum = 0;
            i = j;
            j++;
            k = 0;

        }
        System.out.println(res);
    }

}
