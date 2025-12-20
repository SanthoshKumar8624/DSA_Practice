package StarPatterns;

public class Triangle
{
    public static void Ltriangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("+");
            }
            System.out.println("");
        }
    }
    public static void Rtriangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
                {
                System.out.print("+");
                }
            System.out.println("");
        }
    }
    public static void RAligntriangle(int n)//we add spaces to shift the star at end
    {
        for(int i=1;i<=n;i++)
        {
            for(int s=n-1;s>=i;s--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("+");
            }
            System.out.println("");
        }
    }
    public static void Pyramid(int n)//same as above, we add space to shift stars then i*2-1
    {
        for(int i=1;i<=n;i++)
        {
            for(int s=n-1;s>=i;s--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print("+");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args)
    {
        Triangle t=new Triangle();

        Ltriangle(5);
        System.out.println("--------------------");
        Rtriangle(5);
        System.out.println("--------------------");
        RAligntriangle(5);
        System.out.println("--------------------");
        Pyramid(5);
    }
}
