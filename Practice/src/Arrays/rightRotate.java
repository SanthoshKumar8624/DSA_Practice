package Arrays;

import java.util.Arrays;

public class rightRotate {
    public static void Reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));

        int k = 2;
        int n = a.length;
        k = k % n;
        Reverse(a, 0, n - 1);
        Reverse(a, 0, k - 1);
        Reverse(a, k, n - 1);
        System.out.println(Arrays.toString(a));
    }

}
