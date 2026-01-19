package Codeforces_Contests.January_18_2026;

import java.util.*;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int max=0;
            for(int i=0; i<n; i++){
                int val = sc.nextInt();
                max=Math.max(max, val);
            }

            System.out.println(max*n);
        }
    }
}
