package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Count_Consonants {
    public static void main(String[] args) {
        String s = "code";
        System.out.println(count(s, 0));
    }
    public static int count(String s, int i){
        if(i==s.length()) return 0;
        char c = Character.toLowerCase(s.charAt(i));
        int val = (c>='a' && c<='z' && !(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')) ? 1 : 0;
        return val + count(s, i+1);
    }
}
