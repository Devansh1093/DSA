/*
Intersection of Two Array
*/



//M1 

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int count =0;
        HashSet<Integer> mp = new HashSet<>();
       HashSet<Integer> map = new HashSet<>();
       
       for(int num:nums1){
        mp.add(num);
       }
       for(int num2:nums2){
        if(mp.contains(num2)){
            map.add(num2);
        }
       }

       int [] arr = new int[map.size()];
       int i =0;
       for(int num:map){
        arr[i] = num;
        i =i+1;
       }
        
       return arr;
        }
       
       
    }
