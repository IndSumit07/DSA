package Contest.AtCoder_Contests.AtCoder_Begineer_Contest_450;

import java.util.*;

public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n).append(",");
            n--;
        }
        int len = sb.length();
        sb.setLength(len-1);
        System.out.println(sb);
    }
}
