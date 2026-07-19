package Contest.AtCoder_Contests.AtCoder_Begineer_Contest_451;

import java.util.*;

public class B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m+1];
        int[] b = new int[m+1];

        for(int i=1; i<=n; i++){
            int curdep = sc.nextInt();
            int nextdep = sc.nextInt();

            a[curdep]++;
            b[nextdep]++;
        }

        for(int i=1; i<=m; i++){
            System.out.println(b[i]-a[i]);
        }
    }
}
