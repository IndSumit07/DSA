package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Largest_Digit {
    public static void main(String[] args) {
        int n = 492;
        System.out.println(max(n));
    }
    public static int max(int n){
        if(n<10) return n;
        return Math.max(n%10, max(n/10));
    }
}
