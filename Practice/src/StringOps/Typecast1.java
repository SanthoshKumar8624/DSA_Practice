package StringOps;
public class Typecast1
{
    public static void main(String[] args) {
        String s="helloA";  //convert char to char+4  like A->E
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            c=(char)(c+4);
            System.out.print(c);
        }
    }
}
