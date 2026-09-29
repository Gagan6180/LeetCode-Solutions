class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>sub = new ArrayList<>();
        List<List<Integer>>res = new ArrayList<>();

        dfs(0,nums,sub,res);
        return res;
    }
    public void dfs(int i, int[] nums, List<Integer>sub , List<List<Integer>>res){
        if(i >= nums.length){
             // base case
            res.add(new ArrayList<>(sub));
            return;
        }

        sub.add(nums[i]);
        dfs(i+1,nums,sub,res); // include

        sub.remove(sub.size()-1);
        dfs(i+1,nums,sub,res); // exclude
    }
}