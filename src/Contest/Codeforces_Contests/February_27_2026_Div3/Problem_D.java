package Contest.Codeforces_Contests.February_27_2026_Div3;

import java.util.*;

public class Problem_D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }

            List<Integer> outside = new ArrayList<>();

            for (int i = 0; i < x; i++)
                outside.add(p[i]);

            for (int i = y; i < n; i++)
                outside.add(p[i]);

            Collections.sort(outside);

            int idx = 0;

            for (int i = 0; i < x; i++)
                p[i] = outside.get(idx++);


            for (int i = y; i < n; i++)
                p[i] = outside.get(idx++);

            for (int i = 0; i < n; i++)
                System.out.print(p[i] + " ");
            System.out.println();
        }
    }
}