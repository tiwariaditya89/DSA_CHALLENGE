import java.io.*;
import java.util.*;

class RotateAnArray {
	public static void main (String[] args) {
	   Scanner sc =new Scanner(System.in);
	    int n = sc.nextInt();
	    int [] arr  = new int[n];
	    int k = sc.nextInt;
	    int n = arr.length;
	   
	    rotateArray(arr,n,k);
	    for (int a:arr ){
	        System.out.print(a + " ");
	    } 
	    
	}
	public static void rotateArray(int []arr,int n,int k){
	    reverseArray(arr,0,n-1);
	    reverseArray(arr,0,k-1);
	    reverseArray(arr,k,n-1);
	    
	    
	}
	public static void reverseArray(int []arr,int l,int r){
	    while(l<=r){
	        int temp = arr[l];
	        arr[l] = arr[r];
	        arr[r] = temp;
	        l++;
	        r--;
	    }
	}
}
