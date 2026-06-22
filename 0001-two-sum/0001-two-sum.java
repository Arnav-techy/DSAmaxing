class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        
        int ind1,ind2;
        for(int i=0;i<n;i++){
            int current=nums[i];
            int compliment=target-current;
            if(map.containsKey(compliment)){
                
                ind2=i;
                ind1=map.get(compliment);
                return new int[]{ind1,ind2};
                

            }
            map.put(current,i);
        }
        return new int[]{-1,-1};
        
    }
}