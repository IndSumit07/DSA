package Codeforces_Questions;

import java.util.*;
public class Array_Coloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            boolean check = true;
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }

            for(int i=0; i<n-1; i++){
                if(arr[i]%2==arr[i+1]%2){
                    check=false;
                    break;
                }
            }

            if(check){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
