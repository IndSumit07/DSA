package Contest.Codeforces_Contests.February_23_Div2;

import java.util.Scanner;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            String x = sc.next();

            int requiredA=(n+1)/2;
            int requiredB=n/2;

            int fixedA=0, fixedB=0;
            for (int i = 0; i < n; i++) {
                char c = x.charAt(i);
                if (c == 'a') fixedA++;
                else if (c == 'b') fixedB++;
            }

            int q = n - fixedA - fixedB;
            int assA = requiredA - fixedA;
            int assB = requiredB - fixedB;

            if (assA < 0 || assB < 0 || assA + assB != q) {
                System.out.println("NO");
                continue;
            }

            char[] T = new char[n];
            for (int i = 0; i < n; i++) {
                T[i] = (i % 2 == 0) ? 'a' : 'b';
            }

            char[] S = new char[n];
            int assignACopy = assA;
            int assignBCopy = assB;

            for (int i = 0; i < n; i++) {
                if (x.charAt(i) != '?') {
                    S[i] = x.charAt(i);
                } else {
                    if (assignACopy > 0) {
                        S[i] = 'a';
                        assignACopy--;
                    } else {
                        S[i] = 'b';
                        assignBCopy--;
                    }
                }
            }

            int left = 0;
            int right = n - 1;
            boolean possible = true;

            for (int i = 0; i < n; i++) {
                char need = S[i];

                if (T[left] == need) {
                    left++;
                } else if (T[right] == need) {
                    right--;
                } else {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");

        }
    }
}
