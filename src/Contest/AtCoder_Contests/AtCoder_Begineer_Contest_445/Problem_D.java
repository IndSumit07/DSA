package Contest.AtCoder_Contests.AtCoder_Begineer_Contest_445;

import java.util.*;

public class Problem_D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int n = s.length();
        if(s.charAt(0) == s.charAt(n-1)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
