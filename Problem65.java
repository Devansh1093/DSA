//Koko eating bananas


class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 0;
        int right =1;
        for (int x : piles) {
            right = Math.max(right, x);
        }

         while(left +1 < right){
            int mid = left + (right -left)/2;
            if(caneat(piles,mid,h)){
                right = mid;
            }
            else{
                left = mid;
            }
            
         }
         return right;
    }
    boolean caneat(int[] piles,int mid,int h){
        int actualHours=0;
        for(int pile:piles){
            actualHours +=  pile/mid;
            if(pile%mid!=0){
                actualHours++;
            }
            if (actualHours > h) {
                return false;
            }

        }
        return actualHours<=h;
    }
}