package AtCoder_Contests.January_31_2026;

import java.util.Scanner;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans=0;

        while(k>0){
            ans++;
            k-=n;
            n++;
        }

        System.out.println(ans-1);
    }
}
