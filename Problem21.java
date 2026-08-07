// Find Common Characters

// Frequency array Tough question
class Solution {
    public List<String> commonChars(String[] words) {
        int [] minfreq = new int[26];
        for(int i =0;i<minfreq.length;i++){
            minfreq[i] = Integer.MAX_VALUE;
        }
        for(String word:words){
            int[] freq = new int[26];

            //Count freq of each character
            for(char ch:word.toCharArray()){
                freq[ch-'a']++;
            }

            for (int i = 0; i < 26; i++) {
                minfreq[i] = Math.min(minfreq[i], freq[i]);
            }

            }
            List<String> ans = new ArrayList<>();

        
        for (int i = 0; i < 26; i++) {
            while (minfreq[i] > 0) {
                ans.add(String.valueOf((char) (i + 'a')));
                minfreq[i]--;
            }

    }
    return ans;
}}