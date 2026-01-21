package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Check_Palindrome {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(num==reverse(num, 0));
    }
    public static int reverse(int n, int rev){
        if(n==0) return rev;

        return reverse(n/10, rev*10+n%10);
    }
}
