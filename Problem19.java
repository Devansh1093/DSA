    /*
    Continuous Subarray Sum
    */
 // Why map.put(0,-1) ?? 
 // Key -> remainder (PrefixSum%k)
 // Value -> first index where this remainder occured 

    // M1 HashMap + Prefix Sum


    // rem = sum % k , 
    class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer ,Integer> map = new HashMap<>();
        int minlength =0;
        map.put(0,-1);
        int sum =0;
        for(int i =0;i<nums.length;i++){
            sum+= nums[i];

            int rem = sum %k;
            if(map.containsKey(rem)){
                if(i-map.get(rem)>=2){
                    return true;
                }
               
            }
             else {
                    map.put(rem,i);
                }
        }
        return false;
    }
}