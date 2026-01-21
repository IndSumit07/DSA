package Monu_Bhaiya.Recursion.Recursion_Sheet;

public class First_Occur {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0,0,0,0,0};
        System.out.println(check(arr, 0, 0));
    }

    public static int check(int[] arr, int target, int i){
        if(i==arr.length) return -1;

        if(arr[i]==target) return i;

        return check(arr, target, i+1);
    }
}
