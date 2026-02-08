package Arrays;
import java.util.Arrays;
public class FindSecondMinAndMax
{
    public static int find2ndMin(int[] a)
    {
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min1)//this find the minimum value
            {
                min2=min1;
                min1=a[i];
            }
            else if(a[i]<min2 && a[i]!=min1)
            {
                min2=a[i];
            }
        }
        return min2;
    }
    public static int find2ndMax(int[] a)
    {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max1)
            {
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2 && a[i]!=max1)
            {
                max2=a[i];
            }
        }
        return max2;
    }
    public static void main(String[] args) {
        int []a={7,3,4,1,5};
        System.out.println(Arrays.toString(a));
        System.out.println("SecondMin: "+find2ndMin(a));
        System.out.println("SecondMax: "+find2ndMax(a));
    }
}
