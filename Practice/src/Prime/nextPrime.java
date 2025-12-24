package Prime;

import java.util.Scanner;

public class nextPrime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j=n+1;j<50;j++)
        {
            n=j;
            boolean flag=true;
            if(n<=1)
            {
                flag=false;
            }
            else
            {
                for(int i=2;i<=Math.sqrt(n);i++)
                {
                    if(n%i==0)
                    {
                        flag=false;
                        break;
                    }
                }
            }
            if(flag)
            {
                System.out.println("Next Prime is :"+n);
                break;
            }
        }
    }
}
