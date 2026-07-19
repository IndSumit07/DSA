package Contest.Codeforces_Contests.Post_Contest_Questions;

import java.util.Scanner;

public class Sorting_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            int idx = -1;

            for(int i=0; i<s.length()-1; i++){
                if(s.charAt(i)=='1' && s.charAt(i+1)=='0'){
                    idx=i;
                    break;
                }
            }

            if(idx==-1){
                System.out.println("Bob");
            }else{
                System.out.println("Alice");
                System.out.println(2);
                int idx1=idx+1;
                int idx2=idx+2;
                System.out.println(idx1 + " " + idx2);
            }
        }
    }
}
