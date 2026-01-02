package Bit_Manipulation;
import java.util.Arrays;
public class singleNumberIII
{
    public static int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {// Step 1: XOR all numbers
            xor ^= num;
        }
        int diffBit = xor & (-xor);// Step 2: Find rightmost set bit
        int a = 0, b = 0;
        for (int num : nums) {// Step 3: Divide into two groups
            if ((num & diffBit) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }
    public static void main(String[] args)
    {
        int [] a={1,2,1,3,2,5};
        System.out.println("Input: "+Arrays.toString(a));
        System.out.println("Unique Element: "+Arrays.toString(singleNumber(a)));
    }
}
