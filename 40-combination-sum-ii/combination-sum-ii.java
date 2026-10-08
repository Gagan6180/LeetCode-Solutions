class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>ans = new ArrayList<>();
        findCombi(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public void findCombi(int start,int [] candidates,int target,List<List<Integer>>ans,List<Integer>res){
        if(target == 0){
            ans.add(new ArrayList<>(res));
            return;
        }

        for(int i=start; i<candidates.length; i++){
            if(candidates[i] > target) break;

            if(i > start && candidates[i] == candidates[i-1]) continue;
            res.add(candidates[i]);
            findCombi(i+1,candidates,target-candidates[i],ans,res);
            res.remove(res.size()-1);
        }
    }
}