package SlidingWindow_FixedSize;

import java.util.Arrays;

public class PermutationinString
{
    public static boolean findString(String s1,String s2)
    {
        if(s1.length()>s2.length())
        {return false;}
        int [] s1count=new int[26];
        int [] s2count=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            s1count[s1.charAt(i)-'a']++;
            s2count[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length()-s1.length();i++)
        {
            if(Arrays.equals(s1count,s2count))
            {return true;}
            s2count[s2.charAt(i)-'a']--;
            s2count[s2.charAt(i+s1.length())-'a']++;
        }
        return (Arrays.equals(s1count,s2count));
    }
    public static void main(String[] args)
    {
        String s1="ab";
        String s2="eidbaooo";
        System.out.println("S1 :"+s1+"  S2 : "+s2);
        System.out.println(findString(s1,s2));
    }
}
