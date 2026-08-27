// Reverse Prefix of Word



class Solution {
    public String reversePrefix(String word, char ch) {
         // String is immmutable 
          char [] ab = word.toCharArray();
        for(int i=0;i<word.length();i++){
                    if (word.charAt(i) == ch) {

            for (int k = 0; k <= i / 2; k++) {

                    char temp = ab[k];
                    ab[k] = ab[i - k];
                    ab[i - k] = temp;
                }

                break;
            }
              
            }
            
            return new String(ab);
            }
            
        
    }