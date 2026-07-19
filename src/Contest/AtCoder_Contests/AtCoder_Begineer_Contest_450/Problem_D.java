package Contest.AtCoder_Contests.AtCoder_Begineer_Contest_450;

import java.util.*;

public class Problem_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();

        long[] arr = new long[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextLong();
            arr[i]=arr[i]%k;
        }

        Arrays.sort(arr);

        long gap=0;
        for(int i=0; i<n-1; i++){
            long temp = arr[i + 1] - arr[i];
            gap=Math.max(gap, temp);
        }

        gap = Math.max(gap, k-(arr[n-1]-arr[0]));
        System.out.println(k-gap);
    }
}
