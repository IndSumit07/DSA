package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Fact_Num {
    public static void main(String[] args) {
        System.out.println(calcFact(4));
    }
    public static int calcFact(int n){
        if(n<=1) return 1;

        return n*calcFact(n-1);
    }
}
