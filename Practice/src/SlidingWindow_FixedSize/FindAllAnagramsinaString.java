package SlidingWindow_FixedSize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsinaString
{
    public static List<Integer>  findAnagrams(String s, String p)
    {
        List<Integer> result=new ArrayList<>();
        if(s.length()<p.length())
        {return result;}
        int [] scount=new int[26];
        int [] pcount=new int[26];
        for(int i=0;i<p.length();i++)
        {
            pcount[p.charAt(i)-'a']++;
            scount[s.charAt(i)-'a']++;
        }
        for(int i=0;i<=s.length()-p.length();i++)
        {
            if(Arrays.equals(scount,pcount))
            {result.add(i);}//adding index if match found
            if(i+p.length()<s.length())
            {
                scount[s.charAt(i)-'a']--;
                scount[s.charAt(i+p.length())-'a']++;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        String s="cbaebabacd";
        String p="abc";
        System.out.println("String : "+s);
        System.out.println("Pattern : "+p);
        System.out.println("Anagrams-at-Index : "+findAnagrams(s,p));
    }
}
