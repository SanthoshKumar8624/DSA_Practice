package Prime;
public class rangePrime
{
    public static void primeFrom(int limit)
    {
        for(int n=2;n<=limit;n++)
        {
            boolean isprime=true;
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    isprime=false;
                    break;
                }
            }
            if(isprime)
            {
                System.out.print(n);
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        primeFrom(100);
        primeFrom(50);

    }
}