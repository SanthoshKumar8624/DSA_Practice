package simpleProgram;

public class Fabonnaci
{
    public static void fabonnaci(int n)
    {
        int a=-1,b=1,c;
        for(int i=1;i<=n;i++)
        {
            c=a+b;//-1+1=0 1+0=1 0+1=1 1+1=2 1+2=3 2+3=5
            a=b;  //1 0 1 1 2 3
            b=c;  //0 1 1 2 3 5
            System.out.println(c);//0 1 1 2 3 5
        }
    }
    public static void main(String[] args)
    {
        fabonnaci(6);
    }
}
