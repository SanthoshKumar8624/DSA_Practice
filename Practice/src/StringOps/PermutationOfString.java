package StringOps;

public class PermutationOfString//recursive approach to find all the permutation of string
{
    public static void main(String[] args) {
        String s = "abc";
        System.out.println("String : "+s);
        permutation(s,"");
    }
    public static void permutation(String s,String result)
    {
        if(s.isEmpty())//(null,abc)
        {
            System.out.println(result);//abc
        }
        else
        {
            for(int i=0;i<s.length();i++)//abc//bc//c
            {
                char ch = s.charAt(i);//a//b//c
                String ans=s.substring(0,i)+s.substring(i+1);//null+bc//null+c//null
                permutation(ans,(result+ch));//(bc,a)//(c,ab)//(null,abc)
            }
        }
    }
}
