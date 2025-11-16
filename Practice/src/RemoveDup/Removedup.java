package RemoveDup;
import java.util.Arrays;

public class Removedup
{
    public static int removeduplicates(int [] arr)
    {
        int i=0;
        for(int j=1;j< arr.length;j++)
        {
            if(arr[j]!=arr[i])
            {
                i++;
                arr[i]=arr[j];
            }
            //If nums[j] == nums[i], we do nothing and let 'j' increment by loop,
            // effectively skipping the duplicate.
        }
        return i+1;
    }
    public static void main(String[] args)
    {
        int [] arr={0,1,1,2,2,3,3,3};
        System.out.println(Arrays.toString(arr));
        int newlength=removeduplicates(arr);
        System.out.print("[");
        for(int k=0;k<newlength;k++)
        {
            System.out.print(arr[k]+",");
        }
        System.out.println("]");
    }
}
