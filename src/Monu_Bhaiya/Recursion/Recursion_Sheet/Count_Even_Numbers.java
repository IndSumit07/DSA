package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Count_Even_Numbers {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        System.out.println(count(arr, 0));
    }
    public static int count(int[] arr, int i){
        if(i==arr.length) return 0;
        int c = (arr[i]%2==0) ? 1 : 0;
        return c + count(arr, i+1);
    }
}
