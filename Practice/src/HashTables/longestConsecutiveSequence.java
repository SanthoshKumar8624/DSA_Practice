package HashTables;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class longestConsecutiveSequence
{
    public static int longestConsecutive(int[] nums)
    {
        if(nums.length==0)
        {return 0;}
        Set<Integer> s=new HashSet<>();
        for(int n:nums)
        {s.add(n);}
        int longestStreak=0;
        for(int n:s)
        {
            if(!s.contains(n-1))//Start counting only if n-1 is not present in set
            {
                int currentNum=n;
                int currentStreak=1;
                while(s.contains(currentNum+1))
                {
                    currentNum++;
                    currentStreak++;
                }
                longestStreak=Math.max(longestStreak,currentStreak);
            }
        }
        return longestStreak;
    }
    public static void main(String[] args) {
        int [] a={100,4,200,1,3,2};
        System.out.println(Arrays.toString(a));
        System.out.println(longestConsecutive(a));
    }
}
