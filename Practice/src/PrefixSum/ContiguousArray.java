package PrefixSum;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class ContiguousArray
{
    public static int findMaxLength(int [] n)
    {
        Map<Integer,Integer>m=new HashMap<>();
        m.put(0,-1);
        int sum=0;
        int maxLength=0;
        for(int i=0;i<n.length;i++)
        {
            sum+=(n[i]==0?-1:1);
            if(m.containsKey(sum))
            {
                maxLength=Math.max(maxLength,i-m.get(sum));
            }
            else
            {
                m.put(sum,i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int [] a={0, 1, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(a));
        System.out.println(findMaxLength(a));
    }
}
