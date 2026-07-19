package Contest.AtCoder_Contests.AtCoder_Begineer_Contest_456;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][6];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int[][] cnt = new int[3][7];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                cnt[i][a[i][j]]++;
            }
        }

        int[][] p = {
                {4, 5, 6},
                {4, 6, 5},
                {5, 4, 6},
                {5, 6, 4},
                {6, 4, 5},
                {6, 5, 4}
        };

        double ans = 0.0;

        for (int[] x : p) {
            double cur = 1.0;
            for (int i = 0; i < 3; i++) {
                cur *= cnt[i][x[i]];
            }
            ans += cur;
        }

        ans /= 216.0;

        System.out.printf("%.10f", ans);
    }
}