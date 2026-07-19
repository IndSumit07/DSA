package Contest.AtCoder_Contests.AtCoder_Begineer_Contest_452;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 7);
        map.put(3, 3);
        map.put(5, 5);
        map.put(7, 7);
        map.put(9, 9);

        int m = sc.nextInt();
        int d = sc.nextInt();

        if(map.containsKey(m) && map.get(m)==d){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
