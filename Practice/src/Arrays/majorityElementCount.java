package Arrays;

public class majorityElementCount
{
    static int  majorityElement(int[] arr)
    {
        int element=arr[0];
        int count=1;
        for(int num:arr)
        {
            if(count==0)
            {
                element=num;
            }
            else if(num==element)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return element;
    }
    public static void main(String[] args)
    {
        int [] a={2,2,1,1,1,2,2};
        System.out.println(" The majority element is "+majorityElement(a));
        //by Boyer-Moore Voting Algorithm
    }
}
