// Remove Duplicate letters


class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Integer> stack = new Stack<>();
        char [] str = s.toCharArray();
        char [] ch = new char[s.length()];
        for(int i =0;i<s.length();i++){
            while(!stack.isEmpty() && str[stack.peek()]>str[i]){
                int stacktop =stack.pop();
                ch[stacktop] = str[i];

            }
            stack.push(i);
        }
        String st = String.valueOf(ch);
        return st;
    }
}