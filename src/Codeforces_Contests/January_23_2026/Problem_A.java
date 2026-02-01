package Codeforces_Contests.January_23_2026;
import java.util.*;
public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int h = sc.nextInt();
            int l = sc.nextInt();

            int[] arr = new int[n];
            int countH=0;
            int countL=0;

            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();

                if(arr[i]<=h) countH++;
                if(arr[i]<=l) countL++;
            }

            int result=Math.min(n/2, Math.min(countL, countH));

            System.out.println(result);



        }
    }
}
