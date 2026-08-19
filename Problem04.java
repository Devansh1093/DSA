/* Roman to Integers
Key Concept = Use two variable to track the current and next elemeent

The value of current is less than next 
sum-= current ;
 */

//M1 

class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        int sum =0;
        char ch = 'a';
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        for(int i =0;i<s.length();i++){
            int current = mp.get(s.charAt(i));
            if(i<s.length()-1){
                int next = mp.get(s.charAt(i+1));
                if(current <next){
                    sum-=current;
                }
                else { sum+= current;}
            } else{
                sum+= current;
            }
        }
        return sum;

    }
}