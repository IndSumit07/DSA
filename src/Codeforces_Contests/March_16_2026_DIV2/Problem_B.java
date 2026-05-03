package Codeforces_Contests.March_16_2026_DIV2;

import java.util.*;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();

            int[] arr=new int[n];

            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }

            int max=0;

            int ans=0;

            for(int i=0; i<n; i++){
                if(arr[i]>=max){
                    max=arr[i];
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}
