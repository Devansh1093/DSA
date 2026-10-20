
// Power of 4

public class Problem73 {
    class Solution {
      boolean power(int n){
        if(n <=0 ){
            return false;
        }
        if(n==1){
            return true;
        }

        if(n%4!=0){
            return false;
        }
        
    return  power(n/4);
        
    }
    public boolean isPowerOfFour(int n) {
        return power(n);
    }
}
}
