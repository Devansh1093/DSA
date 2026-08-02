/*
Maximum Unique Subarray Sum after Deletion

*/



// M1 HashMap + Some BruteForce to handle negative cases 
class Solution {
    public int maxSum(int[] nums) {
        
        int n = nums.length;
        
        int sum =0;
       HashMap<Integer,Integer> mp = new HashMap<>();
       for(int i =0;i<n;i++){
         mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
       }
        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            if(entry.getValue() > 1){
                 entry.setValue(entry.getValue() - 1); 
            }


        }

        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            
            if(entry.getKey()>0){
            sum += entry.getKey();}
            

        }
        if(sum ==0){
         Arrays.sort(nums);
        
            return nums[n-1];
        }
     return sum;
       }
}