package Contest.Codeforces_Contests.January_18_2026;

import java.util.*;
public class Problem_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int h = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }

            int[] temp = new int[n];
            int[] last = new int[n];

            int v = 1;
            for(int i=0; i<m; i++){
                int bi = sc.nextInt()-1;
                int ci = sc.nextInt();

                int curVal;
                if(last[bi]==v){
                    curVal=temp[bi];
                }else{
                    curVal=arr[bi];
                }

                int val=curVal+ci;

                if(val>h){
                    v++;
                }else{
                    temp[bi]=val;
                    last[bi]=v;
                }
            }

            StringBuilder out = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (last[i] == v) out.append(temp[i]);
                else out.append(arr[i]);
                out.append(" ");
            }
            System.out.println(out.toString().trim());
        }
    }
}
