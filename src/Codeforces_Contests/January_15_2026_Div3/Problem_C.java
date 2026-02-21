package Codeforces_Contests.January_15_2026_Div3;

import java.util.*;

public class Problem_C {
    static final int INF = 1_000_000_000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n+1];

            for(int i=1; i<=n; i++){
                arr[i]=sc.nextInt();
            }

            int[][] dp = new int[n+1][7];

            for(int i=0; i<=n; i++){
                Arrays.fill(dp[i], INF);
            }

            for (int i=1; i<=6; i++) {
                dp[1][i] = (i == arr[1]) ? 0 : 1;
            }

            for(int i=2; i<=n; i++){
                for(int j=1; j<=6; j++){
                    int cost=(j==arr[i])?0:1;

                    for(int y=1; y<=6; y++){
                        if(j!=y && j+y!=7){
                            dp[i][j]=Math.min(dp[i][j], dp[i-1][y]+cost);
                        }
                    }
                }
            }

            int ans=INF;

            for(int x=1; x<=6; x++){
                ans=Math.min(ans, dp[n][x]);
            }

            System.out.println(ans);
        }
    }
}
