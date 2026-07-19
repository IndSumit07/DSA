package Contest.AtCoder_Contests.AtCoder_Begineer_Contest_456;

import java.util.*;

public class A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=1; i<=6; i++){
            for(int j=1; j<=6; j++){
                for(int k=1; k<=6; k++){
                    if(i+j+k == x){
                        System.out.println("Yes");
                        return;
                    }
                }
            }
        }

        System.out.println("No");

    }
}
