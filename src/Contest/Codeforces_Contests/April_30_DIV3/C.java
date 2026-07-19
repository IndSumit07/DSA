package Contest.Codeforces_Contests.April_30_DIV3;

import java.util.*;

public class C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            long[] arr = new long[n];

            List<Long> div2 = new ArrayList<>();
            List<Long> others = new ArrayList<>();
            List<Long> div3 = new ArrayList<>();
            List<Long> div6 = new ArrayList<>();

            for(int i=0; i<n; i++){
                long val = sc.nextLong();

                if(val%6==0){
                    div6.add(val);
                }else if(val%2==0){
                    div2.add(val);
                }else if(val%3==0){
                    div3.add(val);
                }else{
                    others.add(val);
                }

            }


            List<Long> ans = new ArrayList<>();
            ans.addAll(div2);
            ans.addAll(others);
            ans.addAll(div3);
            ans.addAll(div6);


            for(long val : ans){
                System.out.print(val + " ");
            }

            System.out.println();
        }

    }
}
