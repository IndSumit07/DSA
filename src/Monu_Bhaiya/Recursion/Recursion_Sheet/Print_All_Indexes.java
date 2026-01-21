package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Print_All_Indexes {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        print(arr, 2, 0);
    }
    public static void print(int[] arr, int k, int i){
        if(i==arr.length) return;
        if(arr[i]==k) System.out.print(i+" ");
        print(arr, k, i+1);
    }
}
