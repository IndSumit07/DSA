package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Remove_Duplicates {
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(remove(s));
    }
    public static String remove(String s){
        if(s.length()<=1) return s;
        if(s.charAt(0)==s.charAt(1)) return remove(s.substring(1));
        return s.charAt(0) + remove(s.substring(1));
    }
}
