package Palindrome;

public class Palindromecheck
{
    public boolean ispalidrome(String s)
    {
        if(s==null)
        {
            return false;
        }
        int left=0;
        int right=s.length()-1;

        while (left<right)
        {
            char charLeft=s.charAt(left);
            char charRight=s.charAt(right);
            if(!Character.isLetterOrDigit(charLeft))
            {
                left++;
            }
            else if (!Character.isLetterOrDigit(charRight))
            {
                right--;
            }
            else
            {
                if(Character.toLowerCase(charLeft)!=Character.toLowerCase(charRight))
                {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Palindromecheck p=new Palindromecheck();

        String s1="appa";
        String s2="@12321@";
        String s3="Samantha";
        System.out.println("'"+s1+"' is "+p.ispalidrome(s1));
        System.out.println("'"+s2+"' is "+p.ispalidrome(s2));
        System.out.println("'"+s3+"' is "+p.ispalidrome(s3));
    }
}
