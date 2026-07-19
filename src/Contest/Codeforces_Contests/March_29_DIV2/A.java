package Contest.Codeforces_Contests.March_29_DIV2;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();

            System.out.print(2+" ");
            for(int i=n; i>=3; i--){
                System.out.print(i+" ");
            }

            System.out.print(1);

            System.out.println();
        }
    }
}
