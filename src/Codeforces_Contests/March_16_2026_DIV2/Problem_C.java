package Codeforces_Contests.March_16_2026_DIV2;

import java.util.*;

public class Problem_C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-->0) {

            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();
            long limit = sc.nextLong();

            long countX = limit / x;
            long countY = limit / y;
            long countZ = limit / z;

            long xyLcm = lcmValue(x, y);
            long xzLcm = lcmValue(x, z);
            long yzLcm = lcmValue(y, z);
            long xyzLcm = lcmValue(xyLcm, z);

            long countXY = limit / xyLcm;
            long countXZ = limit / xzLcm;
            long countYZ = limit / yzLcm;
            long countXYZ = limit / xyzLcm;

            long onlyX = countX - countXY - countXZ + countXYZ;
            long onlyY = countY - countXY - countYZ + countXYZ;
            long onlyZ = countZ - countXZ - countYZ + countXYZ;

            long justXY = countXY - countXYZ;
            long justXZ = countXZ - countXYZ;
            long justYZ = countYZ - countXYZ;
            long commonAll = countXYZ;

            long scoreA = 6 * onlyX + 3 * (justXY + justXZ) + 2 * commonAll;
            long scoreB = 6 * onlyY + 3 * (justXY + justYZ) + 2 * commonAll;
            long scoreC = 6 * onlyZ + 3 * (justXZ + justYZ) + 2 * commonAll;

            System.out.println(scoreA + " " + scoreB + " " + scoreC);
        }
    }

    static long gcdValue(long p, long q) {
        while (q != 0) {
            long temp = p % q;
            p = q;
            q = temp;
        }
        return p;
    }

    static long lcmValue(long p, long q) {
        return p / gcdValue(p, q) * q;
    }
}