package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum
{
    public static List<List<Integer>> findThreeSum(int[] n)
    {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(n);
        for(int i=0;i<n.length-2;i++)
        {
            if(i>0 && n[i]==n[i-1])
            {
                continue;
            }
            int left=i+1;
            int right=n.length-1;
            while(left<right)
            {
               int sum=n[i]+n[left]+n[right];
               if(sum==0)
               {
                   result.add(Arrays.asList(n[i],n[left],n[right]));
                   while(left<right && n[left]==n[left+1])
                   {
                       left++;
                   }
                   while(left<right && n[right]==n[right-1])
                   {
                       right--;
                   }
                   left++;
                   right--;
               }
               else if(sum<0)
               {
                   left++;
               }
               else
               {
                   right--;
               }
            }
        }
        return result;
    }
    public static void main(String [] args)
    {
        int [] n={-1,0,1,2,-1,-4};
        System.out.println(Arrays.toString(n));
        System.out.println(findThreeSum(n));
    }
}
