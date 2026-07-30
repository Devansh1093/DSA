/*
Problem 2
Hash Table
Majority Element
*/


// M1  Brute Force: TLE

class Solution {
    public int majorityElement(int[] nums) {
        int element =0;
             int max_count =0;
        for(int i =0;i<nums.length;i++){
             int no = nums[i];
             int count = 0;
             
            for(int j =0;j<nums.length;j++){
               if(no == nums[j]){
                count++;
               
               
            }
            
            
        }
         if(max_count<count){
                  element = no;
                  max_count = count;
                }
               }
        return element;
    }
}

// M2 HashMap

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        ;
        for(int i =0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);  
        }
        n = n/2;
        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            if(entry.getValue()> n){
                return entry.getKey();
            }
        }
    
        return 0;
        
    }
}