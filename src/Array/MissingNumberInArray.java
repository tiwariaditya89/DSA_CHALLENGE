package Array;

import java.util.Scanner;

public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missingNumber(arr,n));
    }
    public static int missingNumber(int array[], int n) {
        int sum=(n*(n+1))/2;
        int actualSum=0;
        for(int i =0;i<n-1;i++){
            actualSum+=array[i];
        }
        int res=sum-actualSum;
        return res;
    }
}
