package Monu_Bhaiya.Recursion;

public class Dice_Throw {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int dice=3;

        System.out.println(totalPaths(arr, dice, 0));
    }

    public static int totalPaths(int[] arr, int dice, int i){
        if(i>=arr.length-1) return 1;

        int total=0;

        for(int j=1; j<=dice; j++){
            total+=totalPaths(arr, dice, i+j);
        }

        return total;
    }
}
