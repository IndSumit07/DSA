package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Print_Decending {
    public static void main(String[] args) {
        printDesc(5);
    }
    public static void printDesc(int n){
        if(n==0) return;

        System.out.println(n);
        printDesc(n-1);
    }
}
