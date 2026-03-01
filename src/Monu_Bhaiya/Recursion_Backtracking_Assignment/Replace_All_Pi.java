package Monu_Bhaiya.Recursion_Backtracking_Assignment;

import java.util.Scanner;

public class Replace_All_Pi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            System.out.println(replacePi(s, 0, ""));
        }
    }

    public static String replacePi(String s, int idx, String ans) {
        if (idx == s.length()) return ans;

        if (idx + 1 < s.length()
                && s.charAt(idx) == 'p'
                && s.charAt(idx + 1) == 'i') {
            return replacePi(s, idx + 2, ans + "3.14");
        }

        return replacePi(s, idx + 1, ans + s.charAt(idx));
    }
}
