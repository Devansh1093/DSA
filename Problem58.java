public class Problem58 {
    
}

// FIrst and last occurence of element in array 
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left =-1;
        int right = nums.length;
         int [] arr = new int[2];
        while(left +1 < right){
            int mid = left + (right -left)/2;
            if(target <= nums[mid]){
                right = mid;
            }
            else {
                left = mid;
            }


        }
        // important line 
        if (right == nums.length || nums[right] != target) {
            return new int[]{-1, -1};
        }
        arr[0] = right ;

        int left2 = -1;
        int right2 = nums.length;
         while(left2 +1 < right2){
            int mid2 = left2 + (right2 -left2)/2;
            if(target >= nums[mid2]){
                left2 = mid2;
            }
            else {
                right2 = mid2;
            }
            

        }
        arr[1] = left2;

          return arr;
    }
}