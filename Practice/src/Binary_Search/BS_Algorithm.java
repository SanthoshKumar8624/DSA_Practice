package Binary_Search;
import java.util.Arrays;
import java.util.Scanner;

public class BS_Algorithm {
    public static void main(String[] args) {
        int [] a={-80,-55,-10,0,1,4,6,8,11,32,47};
        System.out.println(Arrays.toString(a));
        System.out.println("Enter the number to search: ");
        Scanner s = new Scanner(System.in);
        int target=s.nextInt();
        System.out.println("Target found at index: "+binarySearch(a,target));
    }
    public static int binarySearch(int[] a,int target) {
        int start=0;
        int end=a.length-1;
        while(start<=end) {
//            int mid=(start+end)/2; //this might be possible but (start+end) extends the int range
            int mid=start+(end-start)/2;
            if(target<a[mid]) {
                end=mid-1;
            }
            else if(target>a[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
