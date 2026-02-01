package Codeforces_Contests.January_25_2026;

import java.util.*;

public class Problem_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int q = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for(int i=0; i<n; i++){
                a[i]=sc.nextInt();
            }
            for(int i=0; i<n; i++){
                b[i]=sc.nextInt();
            }

            for(int i=0; i<n; i++){
                a[i]=Math.max(a[i], b[i]);
            }

            for(int i=n-2; i>=0; i--){
                a[i]=Math.max(a[i], a[i+1]);
            }

            long[] pref = new long[n];
            pref[0] = a[0];
            for(int i = 1; i < n; i++){
                pref[i] = pref[i - 1] + a[i];
            }

            for(int i = 0; i < q; i++){
                int l = sc.nextInt();
                int r = sc.nextInt();

                long sum = (l == 1) ? pref[r - 1] : pref[r - 1] - pref[l - 2];
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
