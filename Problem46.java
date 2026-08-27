//  Final Prices with a special Discount


class Solution {
    public int[] finalPrices(int[] prices) {
        Stack <Integer> stack = new Stack<>();
        int [] result = prices.clone();
        for(int i =0;i<prices.length;i++){
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                 int index = stack.pop();

                result[index] = prices[index] - prices[i];
            }
            stack.push(i);
            }
            return result;
        }
        
    }