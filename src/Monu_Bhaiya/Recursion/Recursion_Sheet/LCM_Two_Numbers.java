package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class LCM_Two_Numbers {
    public static void main(String[] args) {
        int a = 4, b = 6;
        int start = (a>b) ? a : b;
        System.out.println(lcm(a, b, start));
    }
    public static int lcm(int a, int b, int k){
        if(k%a==0 && k%b==0) return k;
        return lcm(a, b, k+1);
    }
}
