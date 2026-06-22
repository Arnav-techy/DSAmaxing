class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid,low=0,high=nums.length-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        return low;
        
    }
}