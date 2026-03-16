import java.util.*;
import java.io.*;

public class BoilerPlate {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int t = nextInt();
        while (t-- > 0) {
            solve();
        }
        System.out.print(sb);
    }

    static void solve() throws IOException {
        int n = nextInt();
        // your code here


    }

    // ─── Input Helpers ───────────────────────────────────────────
    static String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }
    static int nextInt() throws IOException { return Integer.parseInt(nextToken()); }
    static long nextLong() throws IOException { return Long.parseLong(nextToken()); }
    static double nextDouble() throws IOException { return Double.parseDouble(nextToken()); }
    static String nextLine() throws IOException { return br.readLine(); }

    static int[] nextIntArray(int n) throws IOException {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = nextInt();
        return a;
    }
    static long[] nextLongArray(int n) throws IOException {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = nextLong();
        return a;
    }

    // ─── Output Helpers ──────────────────────────────────────────
    static void println(Object o) { sb.append(o).append('\n'); }
    static void print(Object o) { sb.append(o); }
    static void YES() { sb.append("YES\n"); }
    static void NO() { sb.append("NO\n"); }

    // ─── Utility ─────────────────────────────────────────────────
    static int[] sort(int[] a) { Arrays.sort(a); return a; }
    static long mod = 1_000_000_007L;
    static long gcd(long a, long b) { return b == 0 ? a : gcd(b, a % b); }
    static long lcm(long a, long b) { return a / gcd(a, b) * b; }
    static long power(long base, long exp, long mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) result = result * base % mod;
            base = base * base % mod;
            exp >>= 1;
        }
        return result;
    }
}
