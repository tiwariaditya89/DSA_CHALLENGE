package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayInGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(i,sc.nextInt());
        }
        reverseInGroups(arr,n,k);
        System.out.println(arr);
    }

    //Function to reverse every sub-array group of size k.
   public static  void reverseInGroups(ArrayList<Integer> arr, int n, int k) {

        for(int i=0;i<n;i=i+k){
            int start = i;
            int end = Math.min(i+k-1,n-1);
            while(start<=end){
                int temp= arr.get(start);
                arr.set(start,arr.get(end));
                arr.set(end,temp);
                start++;
                end--;
            }
        }
    }
}
