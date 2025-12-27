package Arrays;

import java.util.Arrays;

public class productOfArrayExceptSelf
{
    public static int [] productExceptSelf(int[] num)
    {
        int n=num.length;
        int [] output = new int [n];
        output[0]=1;
        for(int i=1;i<n;i++)//here, we multiply the left element and store in output array
        {
            output[i]=output[i-1]*num[i-1];
        }
        System.out.println("The product of left elements is "+Arrays.toString(output));
        int right=1;
        for(int i=n-1;i>=0;i--)//then so we already have the left products just multiply with right elements
        {
            output[i]*=right;
            right*=num[i];
        }
        return output;
    }
    public static void main(String[] args)
    {
        int [] a={1,2,3,4};
        System.out.println("Input array is:"+ Arrays.toString(a));
        System.out.println("Product  Of Array ExceptSelf: "+Arrays.toString(productExceptSelf(a)));

    }

}
