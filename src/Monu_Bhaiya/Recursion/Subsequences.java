package Monu_Bhaiya.Recursion;

public class Subsequences {
    public static void main(String[] args) {
        printSubsequnces("abc", 0, "");
    }
    public static void printSubsequnces(String s, int i, String sub){
        if(i>=s.length()) {
            System.out.println(sub);
            return;
        }

        sub+=s.charAt(i);
        printSubsequnces(s, i+1, sub);
        sub=sub.substring(0, sub.length()-1);
        printSubsequnces(s, i+1, sub);
    }
}
