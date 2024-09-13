// 121. Best Time to Buy and Sell Stock

  public int maxProfit(int[] prices) {
        
     int cost=0;
     int profit=0;
     int minimumvalue=prices[0];
     for(int i=1;i<prices.length;i++)
     {
       cost=prices[i]-minimumvalue;
       profit=Math.max(cost,profit);
       minimumvalue=Math.min(minimumvalue,prices[i]);
     }

    return profit;
    }
