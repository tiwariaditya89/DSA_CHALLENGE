package Array;

import java.util.Scanner;

public class EqulibriumPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution1(arr));
        System.out.println(solution2(arr));
    }

    //    Time complexity of solution is O(n2)
    public static int solution1(int[] arr) {
        int curr = 0;
        while (curr < arr.length) {
            int left = curr - 1;
            int right = curr + 1;
            int sumleft = 0;
            int sumright = 0;
            while (left >=0) {
                sumleft += arr[left];
                left--;
            }
            while (right < arr.length) {
                sumright += arr[right];
                right++;
            }
            if (sumleft == sumright) {
                return curr;
            }
            curr++;
        }
        return -1;
    }
    //    Optimized version
    public static int solution2(int [] arr){
        int[] prefixarray = new int[arr.length];
        int[] suffixarray = new int[arr.length];

        for (int i=1;i<arr.length;i++){
            prefixarray[i] = arr[i-1]+prefixarray[i-1];
        }
        for (int i=suffixarray.length-2;i>=0;i--){
            suffixarray[i]=arr[i+1]+suffixarray[i+1];
        }
        for (int i=0;i<arr.length;i++){
            if (prefixarray[i]==suffixarray[i]){
                return i;
            }
        }
        return -1;
    }
}
