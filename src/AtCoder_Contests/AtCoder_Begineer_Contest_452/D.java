package AtCoder_Contests.AtCoder_Begineer_Contest_452;

import java.util.*;

public class D {

    static final int INF = (int)1e9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        int n = s.length(), m = t.length();

        int[][] nxt = new int[n + 1][26];

        for(int c=0; c<26; c++) nxt[n][c] = INF;

        for(int i=n-1; i>=0; i--){
            for(int c=0; c<26; c++){
                nxt[i][c] = nxt[i + 1][c];
            }
            nxt[i][s.charAt(i) - 'a'] = i;
        }

        long bad = 0;

        for(int l=0; l<n; l++){
            int pos = l;

            for(int i=0; i<m; i++){
                pos = (pos < n) ? nxt[pos][t.charAt(i) - 'a'] : INF;
                if(pos == INF) break;
                pos++;
            }

            if(pos != INF) {
                int r = pos - 1;
                bad += (n - r);
            }
        }

        long total = (long)n * (n + 1) / 2;
        System.out.println(total - bad);
    }
}