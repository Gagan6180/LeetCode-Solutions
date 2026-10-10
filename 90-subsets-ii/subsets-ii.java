class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer>ds = new ArrayList<>();
        List<List<Integer>>res = new ArrayList<>();

        Arrays.sort(nums);
        findSub(0,nums,res,ds);
        return res;
    }
    public void findSub(int i, int [] nums,List<List<Integer>>res,List<Integer>ds){
        res.add(new ArrayList<>(ds));

        for(int j=i; j<nums.length; j++){
            if(j>i && nums[j] == nums[j-1]){
                continue;
            }

            ds.add(nums[j]);
            findSub(j+1,nums,res,ds);
            ds.remove(ds.size()-1);
        }
    }
}