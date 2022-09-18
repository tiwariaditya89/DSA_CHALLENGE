package Array;

import java.util.Scanner;

public class ConvertArrayIntoZigZagFashion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        zigZag(arr,n);
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }

    public static void zigZag(int arr[], int n) {
        for (int i = 1; i < n; i += 2) {
            if (i + 1 == n) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                }
            } else {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                }
                if (arr[i] < arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }

        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
