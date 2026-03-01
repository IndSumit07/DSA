package Codeforces_Contests.February_27_2026_Div3;

import java.util.*;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }

            boolean nonDec = true;
            for(int i=0; i<n-1; i++){
                if(arr[i]>arr[i+1]){
                    nonDec=false;
                    break;
                }
            }

            if(nonDec){
                System.out.println(n);
            }else{
                System.out.println(1);
            }
        }
    }
}
