/*
Hash Table Question
Valid Anagram
*/

// M1 - Brute Force . Not able to solve because of TLE
class Solution {
    public boolean isAnagram(String s, String t) {
        int n = t.length();
        boolean [] used = new boolean[n];
        if(s.length()!= t.length()){
            return false;
        }
        for(int i =0;i<s.length();i++){
            char w = s.charAt(i);

            for(int j =0;j<t.length();j++){
               if(w == t.charAt(j) && used[j] == false){
                used[j] = true;
                break;
               }
               
          
            }
        }
        for(int i =0;i<n;i++){
            if(used[i] == false){
                return false;
            }
        }
        return true;
    }
}



// M2 using two hashmaps and comparision
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mp = new HashMap<>();
        HashMap<Character,Integer> mp2 = new HashMap<>();
     // Creation

     for(int i =0;i<s.length();i++){
        mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i),0)+1);
     }
     for(int i =0;i<t.length();i++){
        mp2.put(t.charAt(i), mp2.getOrDefault(t.charAt(i),0)+1);
     }

     if(mp.equals(mp2)){
        return true;
     }
     return false;
}}

// M3 - using one HashMap, decrement the hashmap

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mp = new HashMap<>();
        
     // Creation

     for(int i =0;i<s.length();i++){
        mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i),0)+1);
     }
     for(int i =0;i<t.length();i++){
        if (!mp.containsKey(t.charAt(i))) {
                return false;
            }

       mp.put(t.charAt(i),mp.get(t.charAt(i))-1);
     }
     for (int value : mp.values()) {
            if (value != 0) {
                return false;
            }
        }
         return true;
}}