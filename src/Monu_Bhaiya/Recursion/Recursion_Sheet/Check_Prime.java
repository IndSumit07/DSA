package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Check_Prime {
    public static void main(String[] args) {
        int N = 7;
        System.out.println(isPrime(N, 2));
    }
    public static boolean isPrime(int n, int i){
        if(n<=1) return false;
        if(i*i>n) return true;
        if(n%i==0) return false;
        return isPrime(n, i+1);
    }
}
