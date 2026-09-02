// Asteroid Collision

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<asteroids.length;i++){
            boolean destroyed = false;
            while(!stack.isEmpty() && asteroids[i]<0 && stack.peek()>0){
                if(stack.peek()< Math.abs(asteroids[i])){
                    stack.pop();
                }
                else if(stack.peek() == Math.abs(asteroids[i])){
                    stack.pop();
                    destroyed = true;
                    break;
                }
                else {
                    destroyed = true;
                    break;
                }
              

            }
              if(!destroyed){
                    stack.push(asteroids[i]);
                }
        }
         int[] result = new int[stack.size()];

        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}