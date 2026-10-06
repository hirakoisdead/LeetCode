class Solution {
    public int buyChoco(int[] prices, int money) { int left=money;
        
        Arrays.sort(prices);

        left = money - prices[0] - prices[1];
        
        if (left>=0){
            return left;
        }
        return money;
    }
}