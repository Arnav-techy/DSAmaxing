class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            int cur=map.getOrDefault(num,0)+1;
            map.put(num,cur);
            if(cur>1){
                return true;
            }
        }
        return false;
        
    }
}