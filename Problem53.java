// First Bad Version



public class Problem53 extends VersionControl {
    public int firstBadVersion(int n) {
        long left =1;
         long right=n;
        
        while(left<right){
            long mid = left + (right-left)/2;
         if(isBadVersion((int) mid)){
          right =mid;}
         else {left =mid+1;
         }

        }
        return (int) right;
        }
    }
