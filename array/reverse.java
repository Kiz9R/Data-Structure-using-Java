package array;

import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rev(arr, n);
        sc.close();
    }

    static void rev(int[] arr, int n) {
        int count = n - 1, l = n / 2;
        for (int i = 0; i < l; i++) {
            int temp = arr[i];
            arr[i] = arr[count];
            arr[count] = temp;
            count--;
        }
        for (int e : arr)
            System.out.print(e + " ");
    }
}
