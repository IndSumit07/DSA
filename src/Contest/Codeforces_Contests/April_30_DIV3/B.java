package Contest.Codeforces_Contests.April_30_DIV3;


import java.util.*;

public class B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            int open=0;
            int close=0;

            for(char ch : s.toCharArray()){
                if(ch=='(') open++;
                else{
                    close++;
                }
            }

            if(open==close){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

    }
}