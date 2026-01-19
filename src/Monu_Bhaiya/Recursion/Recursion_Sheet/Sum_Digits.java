package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Sum_Digits {
    public static void main(String[] args) {
        System.out.println(calSum(12345));
    }
    public static int calSum(int n){
        if(n<10) return n;
        return n%10+calSum(n/10);
    }
}
