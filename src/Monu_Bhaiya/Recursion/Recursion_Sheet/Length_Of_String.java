package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Length_Of_String {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(len(s));
    }
    public static int len(String s){
        if(s.equals("")) return 0;
        return 1 + len(s.substring(1));
    }
}
