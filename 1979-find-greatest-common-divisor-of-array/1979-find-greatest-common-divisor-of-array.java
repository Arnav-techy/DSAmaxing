class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int res=1;
        if(nums[n-1]%nums[0]==0){
            
            return nums[0];  
        }
        else{
            for(int i=1;i<=nums[0]/2;i++){
                if(nums[0]%i==0 && nums[n-1]%i==0){
                    res=i;
                }
            }
            return res;
        }
        
    }
}