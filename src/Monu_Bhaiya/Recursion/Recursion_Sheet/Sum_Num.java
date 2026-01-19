package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Sum_Num {
    public static void main(String[] args) {
        System.out.println(calSum(5));
    }
    public static int calSum(int n){
        if(n<10) return n;

        return n+calSum(n-1);
    }
}
