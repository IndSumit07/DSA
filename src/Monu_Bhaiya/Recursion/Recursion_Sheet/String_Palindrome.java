package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class String_Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(check(s));
    }
    public static boolean check(String s){
        if(s.length()<=1) return true;
        if(s.charAt(0)!=s.charAt(s.length()-1)) return false;
        return check(s.substring(1, s.length()-1));
    }
}
