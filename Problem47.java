
// Make String Great

class Solution {
    public String makeGood(String s) {
        
         String result = "";
        Stack < Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
           if (!stack.isEmpty() && Math.abs(ch - stack.peek()) == 32) {
                stack.pop();
            } else {
                stack.push(ch);
            }

           
        }
        while(!stack.isEmpty()){
           result = stack.pop() +result;
        }
        return result;
    }
}