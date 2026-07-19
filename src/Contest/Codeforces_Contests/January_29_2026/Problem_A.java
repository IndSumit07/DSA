package Contest.Codeforces_Contests.January_29_2026;

import java.util.*;

public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int l=1;
            int r=n;
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                if(i%2!=0){
                    arr[i]=l++;
                }else{
                    arr[i]=r--;
                }
            }

            for(int i=n-1; i>=0; i--){
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
    }
}
