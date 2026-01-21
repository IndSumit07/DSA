package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Power {
    public static void main(String[] args) {
        System.out.println(calPower(5, 3));
    }
    public static int calPower(int a, int n){
        if(n==1) return a;
        return a*calPower(a, n-1);
    }
}
