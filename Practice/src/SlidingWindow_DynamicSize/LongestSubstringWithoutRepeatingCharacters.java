package SlidingWindow_DynamicSize;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters
{
    public static int freqArray(String s)
    {
       int [] freq = new int[128];
       int left=0;
       int maxLength=0;
       for(int right = 0; right < s.length(); right++)
       {
            char current=s.charAt(right);
            while(freq[current]>0)
            {
                freq[s.charAt(left)]--;
                left++;
            }
            freq[current]++;
            maxLength=Math.max(maxLength,right-left+1);
       }
       return maxLength;
    }
    public static int usingMap(String s)
    {
        Map<Character,Integer> map=new HashMap<>();
        int left=0;
        int maxLength=0;
        for(int right = 0; right < s.length(); right++)
        {
            char current=s.charAt(right);
            if(map.containsKey(current))
            {
                left=Math.max(left,map.get(current)+1);
            }
            map.put(current,right);
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
    public static void main(String[] args)
    {
        String s="pwwkew";
        System.out.println("String : "+s);
        System.out.println("MaxLength->FrequencyArray+SlidingWindow : "+freqArray(s));
        System.out.println("MaxLength->HashMap+SlidingWindow : "+usingMap(s));
    }
}
