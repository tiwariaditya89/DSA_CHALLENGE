package Array;

import java.util.Scanner;

public class SortAnArrayOf0s1sAnd2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort012(arr,n);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void sort012(int a[], int n)
    {
        // code here
        int countZero=0;
        int countOne=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                countZero++;
            }else if(a[i]==1){
                countOne++;
            }
        }
        for(int i=0;i<n;i++){
            if(countZero!=0){
                a[i]=0;
                countZero--;
            }else if(countOne!=0){
                a[i]=1;
                countOne--;
            }else{
                a[i]=2;
            }
        }
    }
}
