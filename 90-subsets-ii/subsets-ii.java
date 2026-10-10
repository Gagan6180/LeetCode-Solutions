class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>res = new ArrayList<>();
        List<Integer>ds = new ArrayList<>();

        Arrays.sort(nums);

        findSub(0,nums,res,ds);
        return res;

    }
    public void findSub(int i, int [] nums,List<List<Integer>>res,List<Integer>ds){
        List<Integer> currentSubset = new ArrayList<>(ds);
        if(i >= nums.length ){
            if(!res.contains(currentSubset)){
                res.add(currentSubset);
            }
            return;
        }

        ds.add(nums[i]);
        findSub(i+1,nums,res,ds);

        ds.remove(ds.size()-1);
        findSub(i+1,nums,res,ds);
    }
}