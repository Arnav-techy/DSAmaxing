class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long max=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=nums.length-k;i--){
            
            long cur=nums[i];
            max+=Math.max(cur, cur*mul);
            mul--;
            
            
        }
        return max;
        
        
    }
}