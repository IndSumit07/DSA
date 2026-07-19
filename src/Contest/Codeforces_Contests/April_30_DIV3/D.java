package Contest.Codeforces_Contests.April_30_DIV3;

import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] pos = new int[n][2];
            for (int i = 0; i < n; i++) {
                pos[i][0] = -1;
            }

            for (int i = 0; i < 2 * n; i++) {
                int val = sc.nextInt();
                if (pos[val][0] == -1) {
                    pos[val][0] = i;
                } else {
                    pos[val][1] = i;
                }
            }

            int maxMex = 0;
            int currentL = Integer.MAX_VALUE;
            int currentR = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                currentL = Math.min(currentL, pos[i][0]);
                currentR = Math.max(currentR, pos[i][1]);

                int length = currentR - currentL + 1;
                int countOfNumbers = i + 1;

                if (length == 2 * countOfNumbers) {
                    boolean isValidPalindrome = true;
                    for (int j = 0; j <= i; j++) {
                        int distFromLeft = pos[j][0] - currentL;
                        int distFromRight = currentR - pos[j][1];

                        if (distFromLeft != distFromRight) {
                            isValidPalindrome = false;
                            break;
                        }
                    }

                    if (isValidPalindrome) {
                        maxMex = i + 1;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            System.out.println(maxMex);
        }
        sc.close();
    }
}   