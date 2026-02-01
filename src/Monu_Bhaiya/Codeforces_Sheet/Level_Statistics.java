package Monu_Bhaiya.Codeforces_Sheet;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Level_Statistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            boolean isPossible = true;
            int p=0;
            int c=0;

            for(int i=0; i<n; i++) {
                int pi = sc.nextInt();
                int ci = sc.nextInt();

                if (pi < p || ci < c) {
                    isPossible = false;
                }

                int difP = pi - p;
                int difC = ci - c;

                if (difC > difP) {
                    isPossible = false;
                }

                p=pi;
                c=ci;

            }
            if(isPossible){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
