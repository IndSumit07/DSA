package Codeforces_Contests.April_04_2026_DIV4;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int[] arr = new int[7];
            int max=Integer.MIN_VALUE;
            int maxi=-1;
            for(int i=0; i<7; i++){
                arr[i]=sc.nextInt();
                if(arr[i]>max){
                    maxi=i;
                    max=arr[i];
                }
            }

            int ans=0;

            for(int i=0; i<7; i++){
                if(i==maxi){
                    ans+=arr[i];
                }else{
                    ans+= (-arr[i]);
                }
            }

            System.out.println(ans);
        }
    }
}
