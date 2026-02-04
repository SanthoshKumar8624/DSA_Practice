package SortingAlgo;
import java.util.Arrays;
public class SelectionSort
{
    public static void main(String[] args)
    {
        int [] a={26,2,24,35,45,41,50,46,1,46};
        System.out.println("Original Array        : "+ Arrays.toString(a));
        selectionSort(a);
    }
    public static void selectionSort(int[] a) {
        for(int i=0;i<a.length;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[minIndex])
                {minIndex=j;}
            }
            int temp=a[minIndex];
            a[minIndex]=a[i];
            a[i]=temp;
        }
        System.out.println("shot by Selection Algo :"+Arrays.toString(a));
    }
}
