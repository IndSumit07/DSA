package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Print_Ascending {
    public static void main(String[] args) {
        printAsc(10);
    }
    public static void printAsc(int n){
        if(n==0) return;

        printAsc(n-1);;
        System.out.println(n);
    }
}
