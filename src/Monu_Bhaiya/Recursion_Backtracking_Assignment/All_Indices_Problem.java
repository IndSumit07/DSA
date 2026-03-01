package Monu_Bhaiya.Recursion_Backtracking_Assignment;

import java.util.Scanner;

public class All_Indices_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int val = sc.nextInt();

        for(int i=0; i<n; i++){
            if(arr[i]==val){
                System.out.print(i + " ");
            }
        }
    }
}
