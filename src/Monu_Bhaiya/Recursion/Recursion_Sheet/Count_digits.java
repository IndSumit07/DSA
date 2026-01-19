package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Count_digits {
    public static void main(String[] args) {
        System.out.println(countDigits(12345));
    }
    public static int countDigits(int n){
        if(n<10) return 1;

        return 1+(countDigits(n/10));
    }
}
