public class Problem55 {
    
}



// Arranging coins


class Solution {
    public int arrangeCoins(int n) {
        long left =0;
        long right = n;

        while(left <right){
            long mid = left +(right-left+1)/2;
             long coins = (long) mid * (mid + 1);
            if( coins/2 <=n){
                left = mid;
            }
            else{
                right = mid-1;
            }
        }
        return (int) left;
    }
}