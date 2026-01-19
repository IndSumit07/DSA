package Codeforces_Contests.January_18_2026;

import java.util.*;
public class Problem_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            int max=1;
            int cur=1;

            for(int i=1; i<n; i++){
                if(arr[i]==arr[i-1]){
                    continue;
                }
                if(arr[i]==arr[i-1]+1){
                    cur++;
                }else{
                    cur=1;
                }
                max = Math.max(max, cur);

            }
            System.out.println(max);

        }
    }
}
