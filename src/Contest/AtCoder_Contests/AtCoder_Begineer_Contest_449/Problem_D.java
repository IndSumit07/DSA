package Contest.AtCoder_Contests.AtCoder_Begineer_Contest_449;

import java.util.*;

public class Problem_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int d=sc.nextInt();
        int u=sc.nextInt();

        int ans=0;

        for(int i=l; i<=r; i++){
            for(int j=d; j<=u; j++){
                if(Math.max(i, j)%2==0){
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}

