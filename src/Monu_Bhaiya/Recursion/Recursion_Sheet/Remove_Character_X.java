package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Remove_Character_X {
    public static void main(String[] args) {
        String s = "xoxo";
        System.out.println(remove(s));
    }
    public static String remove(String s){
        if(s.length()==0) return "";
        char c = s.charAt(0);
        return (c=='x'?"":c) + remove(s.substring(1));
    }
}
