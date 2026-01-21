package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Count_Words {
    public static void main(String[] args) {
        String s = "I love code";
        System.out.println(count(s, 0));
    }
    public static int count(String s, int i){
        if(s.isEmpty()) return 0;
        if(i>=s.length()) return 1;
        int val = (s.charAt(i)==' ') ? 1 : 0;
        return val + count(s, i+1);
    }
}
