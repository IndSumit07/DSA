package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Replace_Character {
    public static void main(String[] args) {
        String s = "cat";
        System.out.println(replace(s, 'a', 'o'));
    }
    public static String replace(String s, char o, char n){
        if(s.length()==0) return "";
        char c = s.charAt(0);
        return (c==o?n:c) + replace(s.substring(1), o, n);
    }
}
