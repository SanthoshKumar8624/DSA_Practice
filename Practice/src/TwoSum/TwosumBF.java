package TwoSum;
class TwosumBF
{
    public int [] twosum(int[] num,int target)
    {
        for (int i=0;i<num.length;i++)
        {
            for (int j=1;j<num.length;j++)
            {
                if(num[i]+num[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}