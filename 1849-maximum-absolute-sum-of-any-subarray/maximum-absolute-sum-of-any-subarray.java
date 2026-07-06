class Solution {
    public int maxAbsoluteSum(int[] nums) {

        if(nums.length == 1){
            return Math.abs(nums[0]);
        }

        int maxBest = nums[0];
        int minBest = nums[0];
        int ans = nums[0];

        for(int i=1;i<nums.length;i++){
            int v1 = nums[i];
            int v2 = maxBest + nums[i];
            int v3 = minBest + nums[i] ;

            maxBest = Math.max(v1,v2);
            minBest = Math.min(v1,v3);

            int max = Math.abs(maxBest);
            int min = Math.abs(minBest);

            ans = Math.max(ans,Math.max(max,min));
        }
        return ans ;
    }
}