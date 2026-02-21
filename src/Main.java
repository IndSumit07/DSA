import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int k = sc.nextInt();

        int maxSum=0;
        int windowSum=0;

        int l=0;
        int r=0;

        while(r<n){
            windowSum+=arr[r];

            if((r-l+1)==k){
                maxSum=Math.max(maxSum, windowSum);
                windowSum-=arr[l];
                l++;
            }
            r++;
        }

        System.out.println(maxSum);
    }
}
