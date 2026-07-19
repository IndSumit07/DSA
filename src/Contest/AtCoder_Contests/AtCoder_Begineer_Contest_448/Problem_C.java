package Contest.AtCoder_Contests.AtCoder_Begineer_Contest_448;

import java.util.*;

public class Problem_C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int q=sc.nextInt();

        int[] a = new int[n + 1];
        for(int i=1; i<=n; i++) {
            a[i] = sc.nextInt();
        }
        Integer[] order = new Integer[n];
        for(int i = 0; i < n; i++) {
            order[i] = i + 1;
        }

        Arrays.sort(order, (x, y) -> a[x] - a[y]);

        while(q-- > 0) {

            int k = sc.nextInt();
            Set<Integer> removed = new HashSet<>();

            for(int i = 0; i < k; i++) {
                removed.add(sc.nextInt());
            }
            for(int idx : order) {
                if (!removed.contains(idx)) {
                    System.out.println(a[idx]);
                    break;
                }
            }
        }

        sc.close();
    }
}