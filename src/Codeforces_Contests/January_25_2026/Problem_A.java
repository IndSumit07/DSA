package Codeforces_Contests.January_25_2026;

import java.util.*;

public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int s = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n];
            int sum=0;
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }

            boolean isPossible;

            if(x==0){
                isPossible=(sum==s);
            }else{
                isPossible=(s>=sum) && ((s-sum)%x==0);
            }

            if(isPossible){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
