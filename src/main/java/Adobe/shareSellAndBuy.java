package Adobe;

/**
 * Asked in Round -1 of Adobe
 *
 */
public class shareSellAndBuy {
    public int maxProfit(int [] prices){
        if(prices==null || prices.length==0) return 0;
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i=1;i<prices.length;i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else{
                maxProfit = Math.max(maxProfit,prices[i]-minPrice);
            }
        }
        return maxProfit;

    }

    public static void main(String [] args){
        shareSellAndBuy sbuy = new shareSellAndBuy();
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};

        System.out.println(sbuy.maxProfit(prices1));
        System.out.println(sbuy.maxProfit(prices2));
    }
}
