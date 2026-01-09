package TwoPointers;

import java.util.Arrays;

public class ContainerWithMostWater
{
    public static int maxArea(int[] height)
    {
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        while(left<right)
        {
            int width=right-left;
            int minheight=Math.min(height[left],height[right]);
            int area=minheight*width;
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
            maxarea=Math.max(maxarea,area);
        }
        return maxarea;
    }
    public static void main(String[] args)
    {
        int [] height ={1,8,6,2,5,4,8,3,7};
        System.out.println(Arrays.toString(height));
        System.out.println(maxArea(height));
    }
}
