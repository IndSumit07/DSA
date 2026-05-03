package Codeforces_Questions;

import java.util.Scanner;

public class Chewbacca_and_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n==9){
            System.out.println(9);
            return;
        }

        StringBuilder sb = new StringBuilder();

        while(n>0){
            int ld = n%10;

            if((9-ld)<ld){
                sb.append(String.valueOf(9-ld));
            }else{
                sb.append(String.valueOf(ld));
            }
            n/=10;
        }

        if(sb.charAt(0)=='0'){
            System.out.println("9"+sb.substring(1, sb.length()));
            return;
        }

        System.out.println(sb.reverse());
    }
}
