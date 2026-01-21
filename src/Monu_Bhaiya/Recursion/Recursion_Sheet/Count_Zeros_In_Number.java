package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Count_Zeros_In_Number {
    public static void main(String[] args) {
        int n = 10020;
        System.out.println(count(n));
    }
    public static int count(int n){
        if(n==0) return 0;
        int val = (n%10==0) ? 1 : 0;
        return val + count(n/10);
    }
}
