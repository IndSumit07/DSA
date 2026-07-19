package Contest.AtCoder_Contests.AtCoder_Begineer_Contest_449;

import java.util.*;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int q = sc.nextInt();

        for(int i=0; i<q; i++){
            int type = sc.nextInt();

            if(type==1){
                int r=sc.nextInt();
                int eat=r*cols;
                System.out.println(eat);
                rows-=r;
            }else{
                int c=sc.nextInt();
                int eat=c*rows;
                System.out.println(eat);
                cols-=c;
            }
        }

    }
}

