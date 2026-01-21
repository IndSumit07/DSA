package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class Count_Occur {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0,0,0,0,0};
        System.out.println(count(arr, 0, 0));
    }
    public static int count(int[] arr, int target, int i){
        if(i==arr.length-1){
            return arr[i]==target ? 1:0;
        }

        int count=arr[i]==target ? 1:0;

        return count+count(arr, target, i+1);
    }
}
