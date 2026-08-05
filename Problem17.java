// Pivot Index



// Brute Force 

class Solution {
    public int pivotIndex(int[] nums) {
        int n =nums.length;
        for(int i =0;i<nums.length;i++){
            int leftsum =0;
            int rightsum =0;

            for(int j =0;j<i;j++){
                leftsum += nums[j];
            }
            for(int j =i+1;j<n;j++){
                rightsum += nums[j];
            }
            if(leftsum == rightsum){
                return i;
            }
        }
        return -1;
    }
}


// M2 Prefix Sum

// LeftSUm = prefix[i-1], rightsum = prefix[n-1] - prefix[i]

class Solution {
    public int pivotIndex(int[] nums) {
        int n =nums.length;
        int [] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i =1;i<n;i++){
            prefix[i] = prefix[i-1]+ nums[i];
        }

        for(int i =0;i<n;i++){
            int leftsum=0;
            if(i==0){
                leftsum =0;
            }
            else{
                leftsum = prefix[i-1];
            }
            int rightsum = prefix[n-1] - prefix[i];
            if(leftsum == rightsum){
                return i;
            }
        }
        return -1;
    }
}