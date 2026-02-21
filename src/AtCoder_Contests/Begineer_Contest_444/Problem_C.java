package AtCoder_Contests.Begineer_Contest_444;

import java.util.*;

public class Problem_C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n];

        long sum=0;
        long max=0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            sum += a[i];
            max = Math.max(max, a[i]);
        }

        HashMap<Long, Integer> cnt = new HashMap<>();
        for (long x : a) {
            cnt.put(x, cnt.getOrDefault(x, 0) + 1);
        }

        long[] uniq = new long[cnt.size()];
        int id = 0;
        for (long x : cnt.keySet()) uniq[id++] = x;
        Arrays.sort(uniq);

        ArrayList<Long> ans = new ArrayList<>();

        int minK = (n + 1) / 2;

        for (int k = minK; k <= n; k++) {

            if (sum % k != 0) continue;

            long L=sum / k;

            if (L<max) continue;

            int unbroken = 2 * k - n;

            if (cnt.getOrDefault(L, 0) != unbroken) continue;

            boolean ok = true;

            for (long x : uniq) {
                if (x >= L) break;

                long y = L - x;
                if (x > y) continue;

                int cx = cnt.getOrDefault(x, 0);

                if (x == y) {
                    if ((cx & 1) != 0) {
                        ok = false;
                        break;
                    }
                } else {
                    int cy = cnt.getOrDefault(y, 0);
                    if (cx != cy) {
                        ok = false;
                        break;
                    }
                }
            }

            if (ok) ans.add(L);
        }

        Collections.sort(ans);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ans.size(); i++) {
            if (i > 0) sb.append(" ");
            sb.append(ans.get(i));
        }

        System.out.println(sb.toString());
    }
}
