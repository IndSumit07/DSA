package Monu_Bhaiya.Codeforces_Sheet;

import java.util.Scanner;

public class DIV_64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.next();

        int count=0;

        for(int i=0; i<st.length(); i++){
            if(st.charAt(i)=='1' && count==0){
                count++;
            }
            if(st.charAt(i)=='0' && count!=0){
                count++;
            }
        }

        if(count>=7){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
