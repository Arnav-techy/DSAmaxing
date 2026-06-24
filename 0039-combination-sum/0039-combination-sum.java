class Solution {
    
    public static void solve(int [] a, int index, int sum, int target, List<Integer> temp,List<List<Integer>> ans){
        if(sum == target){ 
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(index==a.length || sum>target){
            return;
        }
        temp.add(a[index]);
        solve(a,index,sum+a[index],target,temp,ans);
        temp.remove(temp.size()-1);
        solve(a,index+1,sum,target,temp,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(candidates,0,0,target,new ArrayList<>(),ans);
        return ans;

    }
}