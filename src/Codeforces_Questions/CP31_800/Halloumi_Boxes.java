package Codeforces_Questions.CP31_800;

import java.util.*;

public class Halloumi_Boxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextLong();
            }

            if(k==1){
                boolean check=true;
                for(int i=0; i<n-1; i++){
                    if(arr[i]>arr[i+1]){
                        check=false;
                        break;
                    }
                }
                if(check){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }else{
                System.out.println("Yes");
            }
        }
    }
}
