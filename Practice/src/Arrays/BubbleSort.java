package Arrays;

import java.util.Arrays;

public class BubbleSort
{
    public static int [] sort(int [] a)
    {
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])   //compare first index with second,then
                {                    //if greater swap else move j
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        return a;
    }
    public static void main(String[] args) {
        int [] a={5,4,3,2,1};
        BubbleSort bs=new BubbleSort();
        System.out.println("Original Array :"+ Arrays.toString(a));
        System.out.println("Sorted Array :"+Arrays.toString(bs.sort(a)));

    }
}
