// Find Peak Element



class Solution {
    public int findPeakElement(int[] nums) {
        int target = Integer.MIN_VALUE;
        
        for(int i =0;i<nums.length;i++){
            if(nums[i]> target){
                target = nums[i];
                }
        }
        int left = 0; 
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right - left)/2;

            if(nums[mid] > target){
                right = mid -1;
            }

            else if(nums[mid] < target){
                left = mid +1;
            }
            else {
                return mid;
            }
        }
        return 0;
        
    
    }
}

// M2



class Solution {
    public int findPeakElement(int[] nums) {
        int left =0;
        int right = nums.length -1;

        while(left<right){
            int mid = left + (right -left)/2;
            if(nums[mid] >nums[mid+1]){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
}