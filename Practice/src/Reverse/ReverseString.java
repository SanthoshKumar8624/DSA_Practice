package Reverse;

public class ReverseString
{
    public char[] Rstring(char[] s)
    {
        int left=0;
        int right=s.length-1;
        while(left<right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }
    public static void main(String[] args)
    {
        ReverseString Rs=new ReverseString();
        String str="Santhosh";
        char [] s1=str.toCharArray();
        System.out.println(str);
        System.out.println(Rs.Rstring(s1));
    }
}
