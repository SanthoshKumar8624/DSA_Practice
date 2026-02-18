package Binary_Search;
import java.util.Arrays;
public class FirstLastPositionOfElementInArray {
    public static void main(String[] args) {
        int[] a = {5, 7, 7, 8, 8, 9};
        int target = 8;
        System.out.println("Sorted Array: " + Arrays.toString(a));
        System.out.println("First and Last of Target Element found in: " + Arrays.toString(findFirstAndLastElement(a, target)));
    }
    public static int[] findFirstAndLastElement(int[] a, int target) {
        int[] result = {-1, -1};
        result[0] = search(a, target, true);
        if (result[0] != -1) {
            result[1] = search(a, target, false);
        }
        return result;
    }
    public static int search(int[] a, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < a[mid]) {
                end = mid - 1;
            } else if (target > a[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}