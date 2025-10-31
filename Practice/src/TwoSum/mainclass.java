package TwoSum;

public class mainclass
{
    public static void main(String[] args)
    {
        TwosumBF Ts1=new TwosumBF();// using Brute force solution
        int [] num={1,2,7,15};
        int target=9;
        int [] result=Ts1.twosum(num,target);
        if(result.length==2)
        {
            System.out.println("Match found! Indices: [" + result[0] + ", " + result[1] + "]");
        }
        else
        {
            System.out.println("No two numbers add up to the target " + target);
        }
        TwosumOC Tw2=new TwosumOC();// using optimised solution
        int [] num1={1,6,3,4};
        int target1=10;
        int [] result1=Tw2.twosum2(num1,target1);
        if(result1.length==2)
        {
            System.out.println("Match found! Indices: [" + result1[0] + ", " + result1[1] + "]");
        }
        else
        {
            System.out.println("No two numbers add up to the target " + target);
        }

    }
}
