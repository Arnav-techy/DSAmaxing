class Solution {
    public int majorityElement(int[] nums) {
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        int n=nums.length;
        for(int num:nums){
            int cur=map.getOrDefault(num,0)+1;
            map.put(num,cur);
            if(cur>n/2){
                return num;
            }
        }
    return 0;
        
        
    }
}