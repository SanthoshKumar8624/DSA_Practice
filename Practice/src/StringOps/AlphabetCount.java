package StringOps;

public class AlphabetCount
{
    public static void count(String S)
    {
        S=S.toLowerCase();  //here am ignore the case by converting to lower
        int [] A=new int[127];
        for(int i=0;i<S.length();i++)
        {
            char c=S.charAt(i);
            A[c]++;
        }
        for(int i=0;i<A.length;i++)
        {
            if(A[i]!=0)
            {
                System.out.println((char)i+"->"+A[i]);
            }
        }
    }
    public static void main(String[] args) {
        String S="Santhosh Kumar S";
        count(S);

    }
}
