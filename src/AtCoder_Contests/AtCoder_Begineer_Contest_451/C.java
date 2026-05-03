package AtCoder_Contests.AtCoder_Begineer_Contest_451;

import java.util.*;

public class C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        TreeMap<Long, Integer> map = new TreeMap<>();
        int count=0;

        while(q-->0){
            int type = sc.nextInt();
            long h = sc.nextLong();

            if(type==1){
                map.put(h, map.getOrDefault(h, 0)+1);
                count++;
            }else{
                NavigableMap<Long, Integer> sub = map.headMap(h, true);
                int removed=0;

                for(int val : sub.values()){
                    removed+=val;
                }

                count-=removed;

                sub.clear();


            }

            System.out.println(count);
        }
    }
}
