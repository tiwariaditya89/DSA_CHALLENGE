package Array;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class LeaderInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(leaderInAnArray(arr,n));
    }
    public static ArrayList<Integer> leaderInAnArray(int[] arr, int n){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        for (int i=n-2;i>=0;i--){
            if(st.peek()<=arr[i]){
                st.push(arr[i]);
            }
        }
        int temp =st.size();
        for (int i=0;i<temp;i++){
            ans.add(st.pop());
        }
        return ans;
    }
}
