package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Max_Element {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,6};
        System.out.println(findMax(arr, 0));
    }
    public static int findMax(int[] arr, int i){
        if(i==arr.length-1) return arr[i];

        return Math.max(arr[i], findMax(arr, i+1));
    }
}
