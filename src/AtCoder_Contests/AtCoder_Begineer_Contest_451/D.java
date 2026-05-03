    package AtCoder_Contests.AtCoder_Begineer_Contest_451;

    import java.util.*;

    public class D {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            List<String> powers = new ArrayList<>();

            int val = 1;

            while(val<=1000000000){
                powers.add(String.valueOf(val));
                val*=2;
            }

            PriorityQueue<String> pq = new PriorityQueue<>((a, b)->Long.compare(Long.parseLong(a), Long.parseLong(b)));
            Set<String> seen = new HashSet<>();

            for(String p : powers){
                pq.add(p);
                seen.add(p);
            }

            int count=0;

            while(!pq.isEmpty()){
                String curr = pq.poll();
                long num = Long.parseLong(curr);
                count++;

                if(count==n){
                    System.out.println(num);
                    return;
                }

                for(String p:powers){
                    String next = curr+p;

                    if(next.length()>10) continue;

                    long nextNum = Long.parseLong(next);
                    if(nextNum>1000000000) continue;

                    if(!seen.contains(next)){
                        pq.add(next);
                        seen.add(next);
                    }
                }
            }

            System.out.println(-1);
        }
    }
