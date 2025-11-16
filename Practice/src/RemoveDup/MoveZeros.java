package RemoveDup;

import java.util.Arrays;

public class MoveZeros
{
    public static int [] mz(int [] a)
    {
        int slow=0;
        for(int fast=0;fast< a.length;fast++)
        {
            if(a[fast]!=0)
            {
                a[slow]=a[fast];
                slow++;
            }
        }
        for (int i=slow;i< a.length;i++)
        {
            a[i]=0;
        }
        return a;
    }
    public static void main(String[] args)
    {
       int [] arr={10,0,7,47,0};
        System.out.println(" Moments before disaster : "+Arrays.toString(arr));
        System.out.println("          After          : "+Arrays.toString(mz(arr)));
    }
}
