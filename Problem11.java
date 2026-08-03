/*  Majority Element 2
 */



// M1 

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count = n/3;
        ArrayList <Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(entry.getValue() > count ){
               list.add(entry.getKey());
            }
        }
        return list;
    }
}