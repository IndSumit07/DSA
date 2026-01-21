package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Print_Array_Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        print(arr, 0);
    }
    public static void print(int[] arr, int i){
        if(i==arr.length) return;
        print(arr, i+1);
        System.out.print(arr[i]+" ");
    }
}
