class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] a=new int[2];
        a[0]=binarySearch(nums,target,true);
        a[1]=binarySearch(nums,target,false);
        return a;
    }
    private int binarySearch(int[]nums, int target,boolean isleft){
        int l=0;
        int r=nums.length-1;
        int index=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>target){
                r=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
                index=mid;
                if(isleft){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }
        }
        return index;
    }
}