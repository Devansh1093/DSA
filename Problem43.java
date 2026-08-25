// Backspace String Compare



class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        String result = " ";
        
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }

            }
            else{
                stack.push(ch);
            }
        }

        while(!stack.isEmpty()){
            result = stack.pop() +result;
        }

        stack.clear();
        String result2 = " ";
        for(int j =0;j<t.length();j++){
            char ch = t.charAt(j);
            if(ch =='#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            result2 = stack.pop() + result2;
        }
        return result.equals(result2);
    }
}