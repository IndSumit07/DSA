package Codeforces_Contests.February_27_2026_Div3;

import java.util.*;

public class Problem_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            Stack<Character> st = new Stack<>();

            for(int i=0; i<n; i++){
                char c = s.charAt(i);
                if(!st.isEmpty() && st.peek()==c){
                    st.pop();
                }else{
                    st.push(c);
                }
            }

            if(st.isEmpty()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
