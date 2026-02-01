package Codeforces_Contests.January_29_2026;

import java.util.*;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            int lastOneIdx=-1;
            int st=0;

            for(int i=0; i<n; i++){
                if(s.charAt(i)=='1'){
                    if(lastOneIdx==-1){
                        st+=(i+1)/3;
                    }else{
                        int gap=i-lastOneIdx-1;
                        st+=gap/3;
                    }
                    st++;
                    lastOneIdx=i;
                }
            }

            if(lastOneIdx==-1){
                st=(n+2)/3;
            }else{
                int gap=n-1-lastOneIdx;
                st+=(gap+1)/3;
            }

            System.out.println(st);
        }
    }
}
