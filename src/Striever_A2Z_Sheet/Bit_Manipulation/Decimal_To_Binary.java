package Striever_A2Z_Sheet.Bit_Manipulation;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        System.out.println(convert(64));
    }
    public static String convert(int n){
        StringBuilder bin = new StringBuilder();

        while(n>0){
            int rem = n%2;
            bin.append(Integer.toString(rem));
            n/=2;
        }

        return bin.reverse().toString();
    }
}
