package AtCoder_Contests.AtCoder_Begineer_Contest_445;

import java.util.*;

public class Problem_C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt()-1;
        }

        for(int i=0; i<n; i++){
            int idx=i;
            while(arr[idx]!=idx){
                idx=arr[idx];
            }

            int root=idx;
            idx=i;
            while(arr[idx]!=idx){
                int next=arr[idx];
                arr[idx]=root;
                idx=next;
            }

            System.out.print(root+1+" ");
        }
    }
}
