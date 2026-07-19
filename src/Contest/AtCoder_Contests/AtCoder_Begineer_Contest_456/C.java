package Contest.AtCoder_Contests.AtCoder_Begineer_Contest_456;

import java.util.*;

public class C {
    static final long MOD = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next(); // only one input

        long ans = 0;
        long len = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                len++;
            } else {
                len = 1;
            }
            ans = (ans + len) % MOD;
        }

        System.out.println(ans);
    }
}