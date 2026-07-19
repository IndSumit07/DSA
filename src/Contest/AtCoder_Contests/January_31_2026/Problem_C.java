package Contest.AtCoder_Contests.January_31_2026;

import java.util.*;
public class Problem_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long T = sc.nextLong();

        long ans = 0;

        boolean open = true;
        long openStart = 0;
        long nextOpen = -1;

        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();

            if (!open && nextOpen <= a) {
                open = true;
                openStart = nextOpen;
            }

            if (open) {
                ans += a - openStart;
                open = false;
                nextOpen = a + 100;
            }
        }

        if (open) {
            ans += T - openStart;
        } else if (nextOpen < T) {
            ans += T - nextOpen;
        }

        System.out.println(ans);
    }
}
