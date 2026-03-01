package Monu_Bhaiya.Recursion_Backtracking_Assignment;

import java.util.Scanner;

public class Last_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int val=sc.nextInt();

        System.out.println(found(arr, val, 0));
    }

    public static int found(int[] arr, int val, int i){
        if(i==arr.length) return -1;

        int idx = arr[i]==val ? i : -1;

        return Math.max(idx, found(arr, val, i+1));
    }
}
