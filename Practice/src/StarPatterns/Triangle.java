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
            for(int s=n-i;s>0;s--)
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
            for(int s=n-i;s>0;s--)
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
    public static void IPyramid(int n)//here, j loop 2*(n-1) and in the spaces,
    {
        for(int i=1;i<=n;i++)
        {
            for(int s=1;s<=i-1;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*(n-i)+1;j++)
            {
                System.out.print("+");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args)
    {
        Ltriangle(5);
        System.out.println("--------------------");
        Rtriangle(5);
        System.out.println("--------------------");
        RAligntriangle(5);
        System.out.println("--------------------");
        Pyramid(5);
        System.out.println("--------------------");
        IPyramid(5);

    }
}
