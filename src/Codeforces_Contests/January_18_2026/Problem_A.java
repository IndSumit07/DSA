package Codeforces_Contests.January_18_2026;
import java.util.*;

public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();

            StringBuilder st = new StringBuilder();
            for(int i=1; i<=n; i++){
                st.append(i);
                if(i<n) st.append(" ");
            }
            System.out.println(st.toString());
        }
    }
}
