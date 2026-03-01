package Monu_Bhaiya.Recursion_Backtracking_Assignment;

import java.util.Scanner;

public class Generate_Binary_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            String s = sc.next();

            printAll(s, 0, "");
        }
    }

    public static void printAll(String s, int idx, String ans){
        if(idx==s.length()){
            System.out.print(ans + " ");
            return;
        }

        if(s.charAt(idx)=='?'){
            printAll(s, idx+1, ans+'0');
            printAll(s, idx+1, ans+'1');
        }else{
            printAll(s, idx+1, ans+s.charAt(idx));
        }
    }
}
