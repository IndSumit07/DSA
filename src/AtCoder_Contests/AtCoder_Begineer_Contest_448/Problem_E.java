package AtCoder_Contests.AtCoder_Begineer_Contest_448;

import java.util.*;

public class Problem_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextLong();
        }

        int q=n-1;
        while(q-->0){
            int u=sc.nextInt();
            int v=sc.nextInt();
            Set<Long> set = new HashSet<>();
            boolean is = true;

            for(int i=u-1; i<=v-1; i++){
                if(set.contains(arr[i])){
                    is=false;
                    break;
                }
                set.add(arr[i]);
            }

            if(is){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}