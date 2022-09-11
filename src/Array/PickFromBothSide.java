package Array;

import java.util.Scanner;

public class PickFromBothSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int b =sc.nextInt();
        System.out.println(solve(arr,b));
    }
    public static int solve(int[] a,int b){
        int i = 0 , j=0,sum=0,max =0;
        while (j<b){
            sum += a[j];
            j++;
        }
        int start = a.length-1;
        int end =a.length-1;
        j--;
        max = sum;
        while (end - start+1<=b){
            sum += a[start]-a[j];
            max = Math.max(max,sum);
            j--;
            start--;

        }
        return max;
    }
}
