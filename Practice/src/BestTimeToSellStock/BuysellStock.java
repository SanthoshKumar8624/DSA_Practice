package BestTimeToSellStock;
import java.util.Arrays;
public class BuysellStock
{
    public static int maxProfit(int [] price)
    {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<price.length;i++)
        {
            if(price[i]<minprice)
            {
                minprice=price[i];
            }
            else if (price[i]-minprice>maxprofit)
            {
                maxprofit=price[i]-minprice;
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int [] prices={7,1,5,3,6,4};
        System.out.println("List of price of stock on each day :"+ Arrays.toString(prices));
        System.out.println("Max Profit from Stock :"+maxProfit(prices));
    }
}
//here we calculate the biggest positive difference from the stock or Prices array.
//   6-1=5!!  on day2 we get min price as 1 later
//   we compare next days like  5-1=4 3-1=2 6-1=5✅ 4-1=3 so on..
//   sup 16-11-25