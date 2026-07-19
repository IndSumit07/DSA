package Contest.AtCoder_Contests.AtCoder_Begineer_Contest_446;

import java.util.*;

public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            int l=sc.nextInt();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<l; j++){
                temp.add(sc.nextInt());
            }

            list.add(temp);
        }

        int[] freq = new int[m+1];

        for(int i=0; i<n; i++){
            boolean found=false;
            for(int j=0; j<list.get(i).size(); j++){
                int pref = list.get(i).get(j);
                if(freq[pref]==0){
                    System.out.println(pref);
                    found=true;
                    freq[pref]=1;
                    break;
                }

            }
            if(!found){
                System.out.println(0);
            }
        }
    }
}
