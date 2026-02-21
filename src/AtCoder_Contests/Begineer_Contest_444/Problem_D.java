    package AtCoder_Contests.Begineer_Contest_444;

    import java.util.*;

    public class Problem_D {
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            int n=sc.nextInt();

            int[] freq=new int[200001];
            int maxA=0;

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                freq[a]++;
                maxA = Math.max(maxA, a);
            }
            int[] cnt = new int[maxA];

            int running = 0;
            for (int len = maxA; len >= 1; len--) {
                running += freq[len];
                cnt[len - 1] = running;
            }

            StringBuilder ans=new StringBuilder();

            long carry=0;

            for (int j = 0; j < maxA; j++) {

                long value = cnt[j] + carry;

                ans.append((char)('0' + (int)(value % 10)));

                carry=value / 10;
            }

            while(carry>0) {
                ans.append((char)('0' + (int)(carry % 10)));
                carry /= 10;
            }

            ans.reverse();

            System.out.println(ans.toString());
        }
    }
