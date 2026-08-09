// Container with Most Water




// M1 two pointe - > start , end 


class Solution {
    public int maxArea(int[] height) {
     int n =height.length;
        int area = 0;
        int max_area = 0;
        int start =0;
        int end = n-1;
        while(start<end){
            int h = Math.min(height[start],height[end]);
            area = h * (end -start);
            if(area>max_area){
               max_area= area;
            }
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return max_area;
    }
}