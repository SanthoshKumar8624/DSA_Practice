package CodingRounds;

import java.util.Arrays;

public class HouseRobberII {
    public static void main(String[] args) {
        int[] n = {2, 7, 9, 3, 1};
        System.out.println(Arrays.toString(n));
        System.out.println("Maximum money robbed : " + rob(n));
    }

    public static int rob(int[] houses) {
        int n=houses.length;
        if (n== 1) {
            return houses[0];
        }
        int case1 = robLinear(houses, 0, n - 2);
        int case2 = robLinear(houses, 1, n - 1);
        return Math.max(case1, case2);
    }
    public static int robLinear(int[] houses, int start, int end)
    {
        int prev1 = 0, prev2 = 0;
        for (int i = start; i <= end; i++) {
            int pick=houses[i]+prev2;
            int notpick=prev1;

            int current=Math.max(pick,notpick);
            prev2=prev1;
            prev1=current;
        }
        return prev1;
    }
}

