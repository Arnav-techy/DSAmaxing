class Solution {
    public int[] singleNumber(int[] nums) {
        int[] a=new int[2];
        Arrays.sort(nums);
        int j=0;
        int i=0;
        while(i<nums.length){
            if(i==nums.length-1 || nums[i]!=nums[i+1]){
                a[j++]=nums[i];
                i++;
            }
            else{
                i+=2;
            }
        }
        return a;
        
    }
}