package Striever_A2Z_Sheet.Bit_Manipulation;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        System.out.println(convert(1011));
    }
    public static int convert(int bin){
        int dec = 0;
        int mult = 1;

        while(bin>0){
            int ld = bin%10;
            dec+=ld*mult;
            bin/=10;
            mult*=2;
        }

        return dec;
    }
}
