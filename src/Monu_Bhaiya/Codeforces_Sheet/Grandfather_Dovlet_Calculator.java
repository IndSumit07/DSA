package Monu_Bhaiya.Codeforces_Sheet;

import java.util.Scanner;

public class Grandfather_Dovlet_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        arr[0] = 6;
        arr[1] = 2;
        arr[2] = 5;
        arr[3] = 5;
        arr[4] = 4;
        arr[5] = 5;
        arr[6] = 6;
        arr[7] = 3;
        arr[8] = 7;
        arr[9] = 6;

        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans=0;

        for(int i=a; i<=b; i++){
            int temp=i;
            while(temp>0){
                int ld = temp%10;
                ans+=arr[ld];
                temp/=10;
            }
        }

        System.out.println(ans);
    }
}
