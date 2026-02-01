package Monu_Bhaiya.Codeforces_Sheet;

import java.util.Scanner;

public class Happy_Birthday_Polycarp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            long n = sc.nextLong();

            int count=0;
            for(long i=1; i<=9; i++){

                long temp=0;
                while(true){
                    temp=temp*10 + i;
                    if(temp<=n){
                        count++;
                    }else{
                        break;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
