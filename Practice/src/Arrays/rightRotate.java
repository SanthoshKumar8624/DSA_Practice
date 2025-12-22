package Arrays;

import java.util.Arrays;

public class rightRotate
{
    public static void rRotate(int[] a, int k)
    {
        k = k % a.length;
        for(int i=0;i<a.length;i++)
        {
            System.out.print(i<k? a[a.length+i-k]+" " : a[i-k]+" ");
        }
    }
    public static void main(String[] args)
    {
        int [] a={1,2,3,4,5};
        int k=3;
        System.out.println(Arrays.toString(a));
        rRotate(a,k);
    }

}
