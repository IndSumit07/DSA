package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Min_Element {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,6};
        System.out.println(findMin(arr, 0));
    }
    public static int findMin(int[] arr, int i){
        if(i==arr.length-1) return arr[i];

        return Math.min(arr[i], findMin(arr, i+1));
    }
}
