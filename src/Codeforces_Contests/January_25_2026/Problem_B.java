package Codeforces_Contests.January_25_2026;

import java.util.*;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }

            int[] sufMax = new int[n];
            sufMax[n-1]=arr[n-1];

            for(int i=n-2; i>=0; i--){
                sufMax[i]=Math.max(arr[i], sufMax[i+1]);
            }

            int idx=-1;
            for(int i=0; i<n; i++){
                if(sufMax[i]>arr[i]){
                    idx=i;
                    break;
                }
            }

            int pos=-1;

            if(idx!=-1){
                int max=sufMax[idx];


                for(int i=n-1; i>=idx; i--){
                    if(arr[i]==max){
                        pos=i;
                        break;
                    }
                }
            }

            int l=idx;
            int r=pos;

            while(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }

            for(int i=0; i<n; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
