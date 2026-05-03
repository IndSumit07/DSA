package Codeforces_Contests.March_16_2026_DIV2;

import java.util.*;

public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            Set<Integer> set = new HashSet<>();

            int ans=n;

            for(int i=0; i<n; i++){
                if(s.charAt(i)=='R' && s.charAt(i+1)=='L'){
                    ans=i+2;
                    break;
                }
            }

            System.out.println(ans);
        }
    }
}
