package PrefixSum;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class SubarraySumEqualsK {
    public static int sumEqualsKCount(int [] a,int k) {
        Map<Integer,Integer>m=new HashMap<>();
        m.put(0,1);
        int sum=0;
        int count=0;
        for(int currentSum:a)
        {
            sum+=currentSum;
            if(m.containsKey(sum-k))
            {
                count+=m.get(sum-k);
            }
            m.put(sum,m.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int [] a={3, 4, 7, -2, 2, 1, 4, 2};
        int [] b={1,-1,0};
        System.out.println(Arrays.toString(a));
        System.out.println(sumEqualsKCount(a,7));
        System.out.println(Arrays.toString(b));
        System.out.println(sumEqualsKCount(b,0));
    }
}
