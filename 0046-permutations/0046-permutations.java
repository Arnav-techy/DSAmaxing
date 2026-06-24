class Solution {
    public static void solve(int[] nums,List<Integer> temp,List<List<Integer>> ans){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int x:nums){
            if(!temp.contains(x)){
                temp.add(x);
                solve(nums,temp,ans);
                temp.remove((Integer)x);
            }
        }
        



    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> sol=new ArrayList<>();
        solve(nums,sol,ans);
        return ans;
        
    }
}