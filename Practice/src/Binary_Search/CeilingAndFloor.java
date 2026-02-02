package Binary_Search;
import java.util.Arrays;
public class CeilingAndFloor
{
    public static void main(String[] args)
    {
        int[] a={2,3,5,9,14,16,18};
        int target=4;
        System.out.println("Array: "+ Arrays.toString(a));
        int ceiling=ceiling(a,target);//ceiling means smallest number greater than or equal to target
        int floor=floor(a,target);//floor means largest number smaller than or equal to target
        System.out.println("Ceiling of "+target+" is: "+ceiling);
        System.out.println("Floor of "+target+" is: "+floor);
    }
    public static  int ceiling(int[] a,int target)
    {
        if(target>a[a.length-1])
        {
            System.out.println("Ceiling doesn't exist");
            return -1;
        }
        int start=0;
        int end=a.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<a[mid])
            {
                end=mid-1;
            }
            else if(target>a[mid])
            {
                start=mid+1;
            }
            else
            {
                return a[mid];
            }
        }
        return  a[start];
    }
    public static int floor(int[] a,int target)
    {
//        if(target<a[0])
//        {
//            System.out.println("Floor doesn't exist");
//            return -1;
//        }
        int start=0;
        int end=a.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<a[mid])
            {
                end=mid-1;
            }
            else if(target>a[mid])
            {
                start=mid+1;
            }
            else
            {
                return a[mid];
            }
        }
        return  end<0 ? -1 : a[end];//if end becomes less than 0 then floor doesn't exist
    }

}
