package array;

import java.util.*;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int j = sort(arr, n);
        for (int i = 0; i < n; i++) {
            if (arr[i] == j) {
                System.out.println("the index of largest element is " + i);
                break;
            }
        }

        sc.close();
    }

    static int sort(int arr[], int n) {
        Arrays.sort(arr);
        return arr[n - 1];
    }

}
