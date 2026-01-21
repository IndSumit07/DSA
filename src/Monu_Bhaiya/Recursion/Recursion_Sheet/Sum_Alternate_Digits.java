package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Sum_Alternate_Digits {
    public static void main(String[] args) {
        int n = 1234;
        int len = (int)Math.log10(n)+1;
        System.out.println(sum(n, len%2!=0));
    }
    public static int sum(int n, boolean f){
        if(n==0) return 0;
        return (f?n%10:0) + sum(n/10, !f);
    }
}
