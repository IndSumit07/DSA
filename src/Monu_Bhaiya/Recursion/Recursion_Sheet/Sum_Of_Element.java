package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Sum_Of_Element {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,6};
        System.out.println(findSum(arr, 0));
    }
    public static int findSum(int[] arr, int i){
        if(i==arr.length-1) return arr[i];

        return arr[i]+findSum(arr, i+1);
    }
}
