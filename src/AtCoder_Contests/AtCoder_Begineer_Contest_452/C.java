package AtCoder_Contests.AtCoder_Begineer_Contest_452;

import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt() - 1;
        }

        int m = sc.nextInt();
        String[] s = new String[m];

        for (int i = 0; i < m; i++) {
            s[i] = sc.next();
        }

        boolean[][][] ok = new boolean[11][11][26];

        for (int i = 0; i < m; i++) {
            String t = s[i];
            int len = t.length();
            for (int j = 0; j < len; j++) {
                ok[len][j][t.charAt(j) - 'a'] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String t = s[i];

            if (t.length() != n) {
                sb.append("No\n");
                continue;
            }

            boolean good = true;

            for (int j = 0; j < n; j++) {
                if (!ok[a[j]][b[j]][t.charAt(j) - 'a']) {
                    good = false;
                    break;
                }
            }

            sb.append(good ? "Yes\n" : "No\n");
        }

        System.out.print(sb);
    }
}