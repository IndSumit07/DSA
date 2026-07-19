package Contest.AtCoder_Contests.AtCoder_Begineer_Contest_450;

import java.util.*;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[][] C = new long[n][n];

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                C[i][j]=sc.nextLong();
            }
        }

        for(int a=0; a<n; a++){
            for(int b=a+1; b<n; b++){
                for(int c=b+1; c<n; c++){
                    if(C[a][b]+C[b][c]<C[a][c]){
                        System.out.println("Yes");
                        return;
                    }
                }
            }
        }

        System.out.println("No");

    }
}
