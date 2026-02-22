package Codeforces_Contests.February_21_Div2;

import java.util.*;
public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            int max=countTrans(s);

            for(int i=0; i<n-1; i++){
                String first = s.substring(0, i+1);
                String second = s.substring(i+1, n);
                String rotated = second+first;

                max = Math.max(max, countTrans(rotated));
            }

            System.out.println(max);
        }
    }

    public static int countTrans(String s){
        int count=1;
        int n = s.length();
        for(int i=0; i<n-1; i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                count++;
            }
        }

        return count;
    }
}
