package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        int n = 5;
        print(n);
        System.out.println();
    }
    public static void print(int n){
        if(n==0) return;
        print(n/2);
        System.out.print(n%2);
    }
}
