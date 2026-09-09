public class Problem57 {
    
}



//Find Smallest Letter Greater Than Target

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = -1;
        int right = letters.length;
        char ch = letters[0];
         
        
        while(left+1 <right){
            int mid = left +(right-left)/2;
            if(target < letters[mid]){
                right = mid;

            }
            
            else{
                left = mid;
            }

        }

        if (right == letters.length) {
            return letters[0];
        }
         ch = letters[right];
        return ch;
    }
}