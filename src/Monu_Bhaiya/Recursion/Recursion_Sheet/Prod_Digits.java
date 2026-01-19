package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Prod_Digits {
    public static void main(String[] args) {
        System.out.println(prodDigits(12345));
    }
    public static int prodDigits(int n){
        if(n<10) return n;
        return n%10*(prodDigits(n/10));
    }
}
