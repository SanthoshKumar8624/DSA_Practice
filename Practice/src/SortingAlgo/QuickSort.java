package SortingAlgo;
import java.util.Arrays;
public class QuickSort {
    public static int findPivot(int [] a,int start,int end) {
        int j=start-1;//j should be start from -1.
        int pivot=a[end];
        for(int i=start;i<=end;i++) {
            if(a[i]<=pivot) {
                j++;// if condition true iterate j .so, that j start from 0.
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        return j;
    }
    public static void quickSort(int [] a,int start,int end) {
        if(start<end) {
            int pivot=findPivot(a,start,end);
            quickSort(a,start,pivot-1);
            quickSort(a,pivot+1,end);
        }
    }
    public static void main(String[] args) {
        int[] a ={7,3,1,5,6,8,2,4};
        System.out.println("Before Sorting: "+ Arrays.toString(a));
        quickSort(a,0,a.length-1);
        System.out.println(" After Sorting: "+ Arrays.toString(a));
    }
}
