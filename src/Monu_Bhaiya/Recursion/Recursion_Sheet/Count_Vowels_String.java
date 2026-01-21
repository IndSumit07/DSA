package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Count_Vowels_String {
    public static void main(String[] args) {
        String s = "coding";
        System.out.println(count(s, 0));
    }
    public static int count(String s, int i){
        if(i==s.length()) return 0;
        char c = s.charAt(i);
        int val = 0;
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') val=1;
        return val + count(s, i+1);
    }
}
