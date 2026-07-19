package Contest.Codeforces_Contests.April_04_2026_DIV4;

import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> primes = generatePrimes(200000);

        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] a=new long[n];

            for(int i=0; i<n-1; i++){
                a[i]=(long) primes.get(i)*primes.get(i+1);
            }
            a[n-1]=(long) primes.get(n-1)*primes.get(0);

            for(int i=0; i<n; i++){
                System.out.print(a[i]+(i+1<n ?" " : ""));
            }
            System.out.println();
        }
    }

    private static List<Integer> generatePrimes(int limit) {
        boolean[] isComposite = new boolean[limit + 1];
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= limit && primes.size() <= 10000; i++) {
            if (!isComposite[i]) {
                primes.add(i);
                for (int j = i * i; j <= limit && j > 0; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        return primes;
    }
}