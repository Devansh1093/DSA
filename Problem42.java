// Remove All Adjacent Duplicates In String


class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        String result = "";
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == ch){
                    stack.pop();
            }
             else {
                stack.push(ch);
            }
            

        }
        while(!stack.isEmpty()){
            result = stack.pop() + result;
        }
        return result;
    }
}