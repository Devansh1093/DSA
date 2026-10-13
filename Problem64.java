//Implement Queue using Stacks


class MyQueue {
  Stack<Integer> stack = new Stack<>();
  Stack<Integer>  stack1 = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        // I push the element in stack1
      stack1.push(x);
    }
    
    public int pop() {
        // for pop I will first empty the first stack and then pop the element of stack2
        peek();
      return stack2.pop();
    }
    
    public int peek() {
        // Push the pop elements of stack1 to stack2
       if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
       }
       return stack2.peek();
    }
    
    public boolean empty() {
        return stack1.empty() && stack2.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */