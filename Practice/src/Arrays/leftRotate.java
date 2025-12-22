package Arrays;

import java.util.Arrays;

public class leftRotate
{
    public static void lRotate(int[] a, int k)
    {
        k = k % a.length;
        for(int i=0;i<a.length;i++)
        {
            System.out.print(i+k<a.length? a[i+k]+" " : a[i+k- a.length]+" ");
        }
    }
    public static void main(String[] args)
    {
        int [] a={1,2,3,4,5};
        int k=3;
        System.out.println(Arrays.toString(a));
        lRotate(a,k);
    }
}
