package Codeforces_Questions.Rated_1200;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Three_Activities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            Pair[] a = new Pair[n];
            Pair[] b = new Pair[n];
            Pair[] c = new Pair[n];

            for(int i=0; i<n; i++){
                a[i]=new Pair(sc.nextInt(), i);
            }
            for(int i=0; i<n; i++){
                b[i]=new Pair(sc.nextInt(), i);
            }
            for(int i=0; i<n; i++){
                c[i]=new Pair(sc.nextInt(), i);
            }

            Arrays.sort(a, (a1, b1)-> b1.val-a1.val);
            Arrays.sort(b, (a1, b1)-> b1.val-a1.val);
            Arrays.sort(c, (a1, b1)-> b1.val-a1.val);

            int ans=0;
            for(int i=0; i<Math.min(3, n); i++){
                for(int j=0; j<Math.min(3, n); j++){
                    for(int k=0; k<Math.min(3, n); k++){
                        int x=a[i].idx;
                        int y=b[j].idx;
                        int z=c[k].idx;

                        if(x!=y && y!=z && x!=z){
                            ans=Math.max(ans, a[i].val+b[j].val+c[k].val);
                        }
                    }
                }
            }

            System.out.println(ans);
        }
    }

    public static class Pair{
        int val;
        int idx;

        Pair(int val, int idx){
            this.val=val;
            this.idx=idx;
        }
    }
}
