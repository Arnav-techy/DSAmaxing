class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int price:prices){
            if(price<min){
                min=price;
            }
            int p=price-min;
            if(p>max){
                max=p;
            }
        }
        return max;

        
    }
}