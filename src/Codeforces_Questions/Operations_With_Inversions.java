package Codeforces_Questions;

import java.util.*;

public class Operations_With_Inversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }

            int count=0;

            for(int i=n-1; i>0; i--){
                for(int j=i-1; j>=0; j--){
                    if(arr[j]>arr[i]){
                        count++;
                        break;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
