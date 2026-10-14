
// Number of Steps to Reduce a Number to Zero


public class Problem70 {


    class Solution {
    int fxn(int num,int steps){
       
        // Base case
        if(num ==0){
            return steps;
        }
        if(num%2 ==0){
            num = num/2;
            steps++;
        }
        if(num%2 !=0){
            num = num-1;
            steps++;
        }
        return fxn(num,steps);
    }
    public int numberOfSteps(int num) {
        int steps =0;
         return fxn(num,steps);
    }
}


}
