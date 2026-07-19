package Contest.Codeforces_Contests.January_18_2026;



import java.util.*;
public class Problem_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            long[] arr = new long[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextLong();
            }

            Set<Long> spikes = new HashSet<>();
            for(int i=0; i<m; i++){
                spikes.add(sc.nextLong());
            }

            String s = sc.next();

            HashMap<Long, Integer> alive = new HashMap<>();

            for(long i : arr){
                alive.put(i, alive.getOrDefault(i, 0)+1);
            }

            long shift = 0;
            long al = n;

            for(int i=0; i<k; i++){
                if(s.charAt(i)=='L') shift--;
                else{
                    shift++;
                }

                ArrayList<Long> dead = new ArrayList<>();

                for(long pos : alive.keySet()){
                    if(spikes.contains(pos+shift)){
                        al-=alive.get(pos);
                        dead.add(pos);
                    }
                }

                for(long x : dead){
                    alive.remove(x);
                }

                System.out.print(al + " ");
            }
            System.out.println();
        }
    }
}
