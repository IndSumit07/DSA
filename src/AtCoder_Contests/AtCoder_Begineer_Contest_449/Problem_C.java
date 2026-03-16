package AtCoder_Contests.AtCoder_Begineer_Contest_449;

import java.util.*;

public class Problem_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();

        String s = sc.next();

        long ans=0;
        int[] count=new int[26];

        for(int j=0; j<n; j++){
            if(j-l>=0){
                count[s.charAt(j-l)-'a']++;
            }

            if(j-r-1>=0){
                count[s.charAt(j-r-1)-'a']--;
            }

            ans+=count[s.charAt(j)-'a'];
        }
        System.out.println(ans);
    }
}

