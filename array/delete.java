package array;

import java.util.*;

class delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int e : arr)
            System.out.print(e);
        System.out.println("\nthe no u want to delete");
        int x = sc.nextInt();
        int j = del(arr, n, x);
        if (j == n)
            System.out.println("Not found");
        else {
            System.out.println("removed");
            for (int k = 0; k < j; k++)
                System.out.print(arr[k]);
        }

        sc.close();
    }

    static int del(int arr[], int n, int x) {
        int i = 0;
        for (i = 0; i < n; i++) {
            // int a=arr[i];
            if (arr[i] == x) {
                break;
            }
            if (i == n)
                return n;
        }

        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
            System.out.println(arr[j]);
        }
        return (n - 1);

    }
}