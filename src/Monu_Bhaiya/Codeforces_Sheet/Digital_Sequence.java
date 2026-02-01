package Monu_Bhaiya.Codeforces_Sheet;

import java.util.Scanner;

public class Digital_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int count=0;

        for(int i=1; i<=k; i++){
            String temp = Integer.toString(i);
            for(int j=0; j<temp.length(); j++){
                count++;
                if(count==k){
                    System.out.println(temp.charAt(j));
                    return;
                }
            }
        }
    }
}
