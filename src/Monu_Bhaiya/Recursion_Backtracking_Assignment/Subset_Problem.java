package Monu_Bhaiya.Recursion_Backtracking_Assignment;

import java.util.*;

public class Subset_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int target = sc.nextInt();

        printSubsets(arr, 0, target, new StringBuilder());
    }

    public static void printSubsets(int[] arr, int i, int target, StringBuilder sb){
        if(target==0){
            System.out.println(sb.toString().trim()+"  ");
            return;
        }
        if(i>=arr.length || target<0){
            return;
        }


        if(target>=arr[i]){
            int len = sb.length();
            printSubsets(arr, i+1, target-arr[i], sb.append(arr[i]+" "));
            sb.setLength(len);
        }
        printSubsets(arr, i+1, target, sb);

    }
}
