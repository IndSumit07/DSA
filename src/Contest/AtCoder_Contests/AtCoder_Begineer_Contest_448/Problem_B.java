package Contest.AtCoder_Contests.AtCoder_Begineer_Contest_448;

import java.util.*;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] c = new long[m+1];
        for(int i=1; i<=m; i++){
            c[i]=sc.nextLong();
        }

        long[] demand = new long[m+1];
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            long b = sc.nextLong();
            demand[a]+=b;
        }
        long ans=0;
        for(int j=1; j<=m; j++){
            ans+=Math.min(c[j], demand[j]);
        }

        System.out.println(ans);
    }
}
