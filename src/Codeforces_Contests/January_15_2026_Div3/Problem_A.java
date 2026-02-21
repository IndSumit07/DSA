package Codeforces_Contests.January_15_2026_Div3;

import java.util.*;

public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            boolean isPossible=false;

            for(int i=0; i<n; i++){
                int num=sc.nextInt();
                if(num==67){
                    isPossible=true;
                }
            }

            if(isPossible){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
