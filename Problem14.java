/*
Best Time to Buy and Sell Stock

*/


//M1 - Brute Force -> leads to TLE


class Solution {
    public int maxProfit(int[] prices) {
        int buy =0;
        int sell =0;
        int max =0;
        int max2 =0;
        for(int i =0;i<prices.length;i++){
            buy = prices[i];
          for(int j =i+1;j<prices.length;j++){
            if(prices[j]>buy){
                max = prices[j] - buy;
            }
            if(max2 <max){
                max2 = max;
            }
          }
        }
        return max2;
    }
}



// M2


