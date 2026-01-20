package Kadanes_Algorithm;

import java.util.Arrays;

public class MaximumSubarray//53
{
    public static int findMaximumSubarray(int[] a)
    {
        int currentsum=a[0];
        int maxsum=a[0];
        for (int i=1;i<a.length;i++)
        {
            currentsum=Math.max(a[i],currentsum+a[i]);
            maxsum=Math.max(maxsum,currentsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int [] a={-2,1,-3,4,-1,2,1};
        System.out.println(Arrays.toString(a));
        System.out.println(findMaximumSubarray(a));
    }
}
