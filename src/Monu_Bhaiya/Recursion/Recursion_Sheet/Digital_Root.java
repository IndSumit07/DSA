package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Digital_Root {
    public static void main(String[] args) {
        int n = 987;
        System.out.println(solve(n));
    }
    public static int solve(int n){
        if(n<10) return n;
        return solve(n/10 + n%10);
    }
}
