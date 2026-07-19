package Contest.AtCoder_Contests.AtCoder_Begineer_Contest_448;

import java.util.*;

public class Problem_D {

    static long mod;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();
        long M=sc.nextLong();
        mod=M * 10007;

        long val=0;
        for(int i=0; i<K; i++) {
            long c=sc.nextLong();
            long l=sc.nextLong();
            val = (val * p10(l) % mod + c * rep(l) % mod) % mod;
        }

        System.out.println(val / M % 10007);
    }

    static long p10(long n) {
        long res = 1, b = 10 % mod;
        for(; n > 0; n >>= 1) {
            if((n & 1) == 1) res = res * b % mod;
            b = b * b % mod;
        }
        return res;
    }

    static long rep(long n) {
        if(n == 0) return 0;
        if(n == 1) return 1 % mod;
        if(n % 2 == 0) {
            long h=rep(n / 2);
            return h * (p10(n / 2) + 1) % mod;
        }
        return (rep(n - 1) * 10 + 1) % mod;
    }
}