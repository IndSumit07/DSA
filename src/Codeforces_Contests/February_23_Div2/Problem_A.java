package Codeforces_Contests.February_23_Div2;

import java.util.Scanner;

public class Problem_A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            long x = sc.nextLong();
            long y=sc.nextLong();

            if ((x-2*y)%3!=0) {
                System.out.println("NO");
                continue;
            }

            long k=(x-2*y)/3;

            if(k<0){
                System.out.println("NO");
                continue;
            }

            long minC=Math.max(0, -y);
            long maxC=k / 2;

            if (minC<=maxC) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
