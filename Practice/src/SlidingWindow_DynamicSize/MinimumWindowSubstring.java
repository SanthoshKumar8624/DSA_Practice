package SlidingWindow_DynamicSize;
import java.util.HashMap;
import java.util.Map;
public class MinimumWindowSubstring
{
    public static String findMinLenSubstring(String s,String t)
    {
        if(s.length()<t.length())
        {
            return "";
        }
        Map<Character,Integer>tmap=new HashMap<>();
        Map<Character,Integer>smap=new HashMap<>();
        for(char c:t.toCharArray())
        {tmap.put(c,tmap.getOrDefault(c,0)+1);}
        int left=0;
        int minLen=Integer.MAX_VALUE;
        int start=0;
        int required=t.length();
        int formed=0;
        for(int right = 0; right < s.length(); right++)
        {
            char c=s.charAt(right);
            smap.put(c,smap.getOrDefault(c,0)+1);
            if(tmap.containsKey(c) && smap.get(c).intValue()==tmap.get(c).intValue())
            {formed++;}
            while(formed==required && left<=right)
            {
                if(right-left+1<minLen)
                {
                    minLen=right-left+1;
                    start=left;
                }
                char leftChar=s.charAt(left);
                smap.put(leftChar,smap.get(leftChar)-1);
                if(tmap.containsKey(leftChar)&& smap.get(leftChar)<tmap.get(leftChar))
                {
                    formed--;
                }
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE? "":s.substring(start,start+minLen);
    }
    public static void main(String[] args) {
        String s="ADOBECODEBANC";
        String t="ABC";
        System.out.println("The String:"+s+" || The pattern :"+t);
        System.out.println("Minimum Window Substring :"+findMinLenSubstring(s,t));
    }
}
