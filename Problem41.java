// Stack


// Baseball Game

class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> stack =  new Stack<>();
        
        for(int i =0;i<operations.length;i++){
            
           if(operations[i].equals("+") ){
             int top = stack.pop();
             int second = stack.peek();

             stack.push(top);
             stack.push(top+second);
           }
          else if(operations[i].equals("D")){
            stack.push(2*stack.peek());
           }
          else if(operations[i].equals("C")){
            stack.pop();
           }
           else{
            stack.push(Integer.parseInt(operations[i]));
           }
        }
                int sum = 0;

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;

    }
}