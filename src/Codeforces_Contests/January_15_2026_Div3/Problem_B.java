package Codeforces_Contests.January_15_2026_Div3;

import java.util.*;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();

            int[] arr = new int[n+1];

            for(int i=1; i<=n; i++){
                arr[i]=sc.nextInt();
            }

            boolean ok=true;
            for(int i=1; i<=n; i+=2){
                List<Integer> pos = new ArrayList<>();
                List<Integer> val = new ArrayList<>();

                int cur=i;
                while(cur<=n){
                    pos.add(cur);
                    val.add(arr[cur]);
                    cur*=2;
                }

                Collections.sort(pos);
                Collections.sort(val);

                if(!pos.equals(val)){
                    ok=false;
                    break;
                }



            }
            System.out.println(ok?"Yes":"No");
        }
    }
}
