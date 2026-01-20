package Kadanes_Algorithm;
import java.util.Arrays;
public class MaximumProductSubarray {
    public static int findMaximumProductSubarray(int[] arr) {
        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result=arr[0];
        for(int i=1;i<arr.length;i++) {
            int currentnum=arr[i];
            if(currentnum<0)//swap min and max products cause one negative num can change maxprod
            {
                int temp=maxProduct;
                maxProduct=minProduct;
                minProduct=temp;
            }
            maxProduct=Math.max(currentnum,maxProduct*currentnum);
            minProduct=Math.min(currentnum,minProduct*currentnum);
            result=Math.max(result,maxProduct);
        }
        return result;
    }
    public static void main(String[] args) {
        int [] a={2,3,-2,4};//testcase1-single negative num
        System.out.println(Arrays.toString(a));
        System.out.println(findMaximumProductSubarray(a));
        int [] b={-2,3,-4};//testcase2-two negative num
        System.out.println(Arrays.toString(b));
        System.out.println(findMaximumProductSubarray(b));
    }
}
