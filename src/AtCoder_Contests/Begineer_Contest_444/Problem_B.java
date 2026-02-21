package AtCoder_Contests.Begineer_Contest_444;

import java.util.*;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count=0;
        for(int i=0; i<=n; i++){
            int temp=i;
            int sum=0;
            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }

            if(sum==k){
                count++;
            }
        }

        System.out.println(count);
    }
}
