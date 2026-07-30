/* 
Problem 3 
Two Sum 
Hash Table


*/


// M1 - Brute Force 



// M2 HashMap

class Solution {
    public int[] twoSum(int[] nums, int target) {
   Map<Integer, Integer> mp = new HashMap<>(); 
   for(int i =0;i<nums.length;i++){
       mp.put(nums[i],i);    
   }
   for(int j=0;j<nums.length;j++){
       int compliment= target- nums[j];
       if(mp.containsKey(compliment) && mp.get(compliment)!=j){
           return new int[] {j,mp.get(compliment)};
       }
   }
   return new int[]{};
    }
}