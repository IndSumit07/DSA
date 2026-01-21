package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Remove_Zeros_From_Number {
    public static void main(String[] args) {
        int n = 1020;
        System.out.println(remove(n));
    }
    public static int remove(int n){
        if(n==0) return 0;
        int d = n%10;
        if(d==0) return remove(n/10);
        return d + 10*remove(n/10);
    }
}
