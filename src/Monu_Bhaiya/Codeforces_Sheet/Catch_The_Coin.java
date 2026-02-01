package Monu_Bhaiya.Codeforces_Sheet;

import java.util.Scanner;

public class Catch_The_Coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(y>=Math.abs(x)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
