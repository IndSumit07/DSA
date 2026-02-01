package Monu_Bhaiya.Recursion;

public class Coin_Flip {
    public static void main(String[] args) {
        flip(3  , "");
    }
    public static void flip(int coins, String temp){
        if(coins==0){
            System.out.println(temp);
            return;
        }

        flip(coins-1, temp+'H');
        flip(coins-1, temp+'T');
    }
    public static void flip2(int coins, String temp){
        if(coins==0){
            System.out.println(temp);
            return;
        }

        if(temp.length()>0 && temp.charAt(temp.length()-1)=='H'){
            flip2(coins-1, temp+'T');
        }else{
            flip2(coins-1, temp+'H');
            flip2(coins-1, temp+'T');
        }
    }
}
