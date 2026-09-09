public class Problem56 {
    
}


// Single element in a sorted array


class Solution {

 boolean func(int [] nums, int idx) {
  if (idx % 2 == 0) {
    return nums[idx] != nums[idx + 1];
  } else {
    return nums[idx] != nums[idx - 1];
  }
}

    public int singleNonDuplicate(int[] nums) {
         int left = -1;
         int right = nums.length-1;
          if(nums.length == 1){
            return nums[0];
          }

         while(left +1 < right){
            int mid = left + (right-left)/2;
            if(func(nums,mid)){
                right = mid;
            }
            else {
                left= mid;
            }

         }
         
         int number = nums[right];

         return number;
    }
  
}