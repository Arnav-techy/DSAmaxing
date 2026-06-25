class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int w=right-left;
            int cur=w*Math.min(height[right],height[left]);
            max=Math.max(max,cur);
            if(height[left]<height[right]){
                left++;

            }
            else{
                right--;
            }
        }
        return max;
        
    }
}