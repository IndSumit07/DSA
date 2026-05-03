package Codeforces_Contests.March_29_DIV2;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();

            int[] p = new int[n+1];

            for(int i=1; i<=n; i++){
                p[i]=sc.nextInt();
            }

            boolean[] marked = new boolean[n + 1];
            int ans = 0;

            for(int i = 1; i <= n; i++) {
                if(marked[i]) break;
                ans++;
                marked[p[i]] = true;
            }

            int fixed = 0;
            for (int i = 1; i <= n; i++) {
                if (p[i] == i) fixed++;
            }

            ans = Math.min(ans, n - fixed);

            System.out.println(ans);
        }
    }
}
