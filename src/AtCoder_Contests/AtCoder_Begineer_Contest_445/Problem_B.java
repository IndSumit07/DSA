package AtCoder_Contests.AtCoder_Begineer_Contest_445;

import java.util.*;

public class Problem_B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] st = new String[n];
        int maxL=Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            st[i]=sc.next();
            maxL=Math.max(maxL, st[i].length());
        }

        for(int i=0; i<n; i++){
            String cur=st[i];
            int len = cur.length();

            if(len==maxL){
                System.out.println(cur);
            }else{
                int diff=maxL-cur.length();
                int half=diff/2;
                for(int j=0; j<half; j++){
                    System.out.print(".");
                }

                System.out.print(cur);

                for(int j=0; j<half; j++){
                    System.out.print(".");
                }

                System.out.println();
            }

        }
    }
}
