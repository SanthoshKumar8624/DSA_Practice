package Bit_Manipulation;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
public class singleNumber
{
    public static int bit(int [] a)
    {
        int result=0;
        for(int num:a)
        {
            result^=num;// xor(^)=here     x ⊕ x = 0: A number XOR'ed with itself cancels out.
                                        // x ⊕ 0 = x: XOR with zero leaves the number unchanged.
        }
        return result;
    }
    public static int  bit2(int [] a)
    {
        Map<Integer,Integer> M=new HashMap<>();
        for(int num:a)
        {
            M.put(num,M.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:M.entrySet())
        {
            if(entry.getValue()==1)
            {
                return entry.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int [] a={1,2,1,2,4};
        System.out.println("Array: "+Arrays.toString(a));
        System.out.println("The Unique Number in the Array(xor): "+bit(a));//by xor ops
        System.out.println("The Unique Number in the Array(map): "+bit2(a));//by Map



    }
}
