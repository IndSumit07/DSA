package Monu_Bhaiya.Recursion_Backtracking_Assignment;

import java.util.Scanner;

public class Recursion_Keypad_Codes {

    static String[] keypad = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        printWords(str, 0, "");
        System.out.println();
        System.out.println(countWords(str, 0));
    }

    public static void printWords(String str, int idx, String ans) {
        if (idx == str.length()) {
            System.out.print(ans + " ");
            return;
        }

        int digit = str.charAt(idx) - '0';
        String letters = keypad[digit];

        for (int i = 0; i < letters.length(); i++) {
            printWords(str, idx + 1, ans + letters.charAt(i));
        }
    }

    public static int countWords(String str, int idx) {
        if (idx == str.length()) return 1;

        int digit = str.charAt(idx) - '0';
        int choices = keypad[digit].length();

        return choices * countWords(str, idx + 1);
    }
}