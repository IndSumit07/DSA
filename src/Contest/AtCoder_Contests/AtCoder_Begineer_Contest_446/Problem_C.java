package Contest.AtCoder_Contests.AtCoder_Begineer_Contest_446;

import java.util.*;

public class Problem_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while(t-->0){
            int n = sc.nextInt();
            int d = sc.nextInt();

            long[] a = new long[n+1];
            long[] b = new long[n+1];

            for(int i=1; i<=n; i++){
                a[i]=sc.nextLong();
            }
            for(int i=1; i<=n; i++){
                b[i]=sc.nextLong();
            }

            Deque<Batch> que = new ArrayDeque<>();

            long total=0;

            for(int day=1; day<=n; day++){
                if(a[day]>0){
                    que.add(new Batch(day, a[day]));
                    total+=a[day];
                }

                long need = b[day];
                while(need>0){
                    Batch front = que.peekFirst();

                    if(front.count<=need){
                        need-=front.count;
                        total-= front.count;
                        que.pollFirst();
                    }else{
                        front.count-=need;
                        total-=need;
                        need=0;
                    }
                }

                while(!que.isEmpty()){
                    Batch front = que.peekFirst();
                    if(day- front.day>=d){
                        total-=front.count;
                        que.pollFirst();
                    }else{
                        break;
                    }
                }

            }
            sb.append(total).append("\n");
        }

        System.out.println(sb);
    }

    public static class Batch{
        int day;
        long count;

        Batch(int day, long count){
            this.day=day;
            this.count=count;
        }
    }
}
