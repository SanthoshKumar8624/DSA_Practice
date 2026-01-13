package PrefixSum;
public class RangeSumQuery
{
    private int [] prefix;
    RangeSumQuery(int [] n)
    {
        prefix=new int[n.length];
        if(n.length>0)
        {
            prefix[0]=n[0];
        }
        for(int i=1;i<n.length;i++)
        {
            prefix[i]=prefix[i-1]+n[i];
        }
    }
    public int range(int left,int right)
    {
        if(left==0)
        {
            return prefix[right];
        }
        return prefix[right]-prefix[left-1];
    }
    public static void main(String[] args)
    {
        int [] a={-2, 0, 3, -5, 2, -1};
        RangeSumQuery  r=new RangeSumQuery(a);
        System.out.println(r.range(0,5));
        System.out.println(r.range(0,2));
    }
}

