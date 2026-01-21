package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Sum_Even_Digits {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n==0) return 0;
        int d = n%10;
        if(d%2!=0) d=0;
        return d + sum(n/10);
    }
}
