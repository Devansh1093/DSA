// Reverse a String using recursion


class Solution {
    void fxn(char[] s, int length,int i ){
      if (i >= length / 2) {
            return;
        }
            char temp = s[i];
            s[i] = s[length-1-i];
            s[length-1-i] = temp;
            

            fxn(s, length, i + 1);
          
        
        
    }
    public void reverseString(char[] s) {
        int length = s.length;
        int i =0;
         fxn(s, length, i);
    }
}