package Monu_Bhaiya.Codeforces_Sheet;

import java.util.Scanner;

public class Playing_With_Paper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long ans=0L;

        while(a!=0 && b!=0){
            if(a>=b){
                ans+=a/b;
                a=a%b;
            }
            else{
                ans+=b/a;
                b=b%a;
            }
        }

        System.out.println(ans);
    }
}
