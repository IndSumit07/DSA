package Contest.Codeforces_Contests.January_25_2026;


import java.util.*;

public class Problem_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();

            long[] a = new long[n];
            long[] b = new long[n];

            for(int i=0; i<n; i++){
                a[i]=sc.nextLong();
            }
            for(int i=0; i<n; i++){
                b[i]=sc.nextLong();
            }

            Arrays.sort(a);

            long[] pref = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                pref[i] = pref[i - 1] + b[i - 1];
            }

            long ans = 0;

            for (int k = 1; k <= n; k++) {
                long need = pref[k];
                if (need > n) break;

                long x = a[n - (int)need];
                ans = Math.max(ans, x * k);
            }

            System.out.println(ans);
        }
    }
}
