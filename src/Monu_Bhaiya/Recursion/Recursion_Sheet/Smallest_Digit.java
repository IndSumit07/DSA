package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Smallest_Digit {
    public static void main(String[] args) {
        int n = 492;
        System.out.println(min(n));
    }
    public static int min(int n){
        if(n<10) return n;
        return Math.min(n%10, min(n/10));
    }
}
