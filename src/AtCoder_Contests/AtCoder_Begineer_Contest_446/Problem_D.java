package AtCoder_Contests.AtCoder_Begineer_Contest_446;

import java.util.*;

public class Problem_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Long, Integer> dp = new HashMap<>();

        int max=0;

        for(int i=0; i<n; i++){
            long x = sc.nextLong();
            int len = dp.getOrDefault(x-1, 0)+1;
            dp.put(x, len);

            max=Math.max(max, len);
        }

        System.out.println(max);
    }
}
