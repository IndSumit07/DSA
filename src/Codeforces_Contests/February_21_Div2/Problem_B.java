package Codeforces_Contests.February_21_Div2;

import java.util.*;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {
            int n=sc.nextInt();
            String s=sc.next();

            List<Integer> ones=new ArrayList<>();
            List<Integer> zeros=new ArrayList<>();

            for(int i=0; i<n; i++) {
                if(s.charAt(i)=='1') {
                    ones.add(i + 1);
                }else {
                    zeros.add(i + 1);
                }
            }

            int oneCount=ones.size();
            int zeroCount=zeros.size();

            if(oneCount%2==0) {
                System.out.println(oneCount);

                if(oneCount>0) {
                    for(int idx:ones) {
                        System.out.print(idx + " ");
                    }
                    System.out.println();
                }
            }
            else if(zeroCount%2==1){
                System.out.println(zeroCount);

                if(zeroCount>0){
                    for(int idx : zeros){
                        System.out.print(idx + " ");
                    }
                    System.out.println();
                }
            }
            else{
                System.out.println(-1);
            }
        }

        sc.close();
    }
}