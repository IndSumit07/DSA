package Monu_Bhaiya.Codeforces_Sheet;

import java.util.Scanner;

public class If_At_First_You_Dont_Succeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if(a<c || b<c){
            System.out.println(-1);
            return;
        }

        int totalPassed = a+b-c;

        if(totalPassed<=d-1){
            System.out.println(d-totalPassed);
        }else{
            System.out.println(-1);
        }
    }
}
