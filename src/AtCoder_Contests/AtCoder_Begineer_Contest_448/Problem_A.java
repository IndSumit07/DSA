package AtCoder_Contests.AtCoder_Begineer_Contest_448;

import java.util.*;

public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            if(a<x){
                x=a;
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}
