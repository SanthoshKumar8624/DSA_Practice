package Palindrome;
public class SentenceCheck
{
    public static boolean check(String A)
    {
        int i=0;
        int j=A.length()-1;
        while(i<j)
        {
            if(A.charAt(i)!=A.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
    public static void main(String[] args) {
        String s="My Mom set to learn Malayalam but I am from katak in gadag".toLowerCase();
        String [] A=s.split(" ");
        for(int i=0;i<A.length;i++)
        {
            if(check(A[i]))
            {
                System.out.println(A[i]);
            }
        }
    }
}
