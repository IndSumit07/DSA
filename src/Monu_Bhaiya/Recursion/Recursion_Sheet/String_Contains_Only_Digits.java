package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class String_Contains_Only_Digits {
    public static void main(String[] args) {
        String s = "1234";
        System.out.println(check(s));
    }
    public static boolean check(String s){
        if(s.length()==0) return true;
        if(!Character.isDigit(s.charAt(0))) return false;
        return check(s.substring(1));
    }
}
