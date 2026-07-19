package Contest.Codeforces_Contests.April_30_DIV3;

import java.util.*;

public class E {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int maxH=0;

            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
                maxH = Math.max(maxH, arr[i]);
            }

            int[] cah = new int[maxH+1];

            for(int h=1; h<=maxH; h++){
                for(int i=0; i<n; i++){
                    if(arr[i]>=h){
                        cah[h]++;
                    }
                }
            }

            long bm = 0;

            for(int i=0; i<n; i++){
                for(int h=1; h<=arr[i]; i++){
                    int frpc = n-cah[n-1];
                }
            }

        }

    }
}
