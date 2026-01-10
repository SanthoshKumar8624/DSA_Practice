package TwoPointers;

public class ReverseStringKeepNonString
{
    public static String reverseString(String str)
    {
        char [] arr = str.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            if(!Character.isLetter(arr[left]))
            {
                left++;
            }
            if(!Character.isLetter(arr[right]))
            {
                right--;
            }
            else
            {
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
    public static boolean palindrome(String str)
    {
        int left=0;
        int right=str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String s1="my age is 13";
        System.out.println(s1);
        System.out.println(reverseString(s1));
        String s2="i love my country";
        System.out.println(s2);
        System.out.println(reverseString(s2));
        String n="123";
        System.out.println(n);
        System.out.println(palindrome(n));
    }
}
