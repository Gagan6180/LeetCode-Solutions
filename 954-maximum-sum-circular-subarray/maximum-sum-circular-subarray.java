class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxBest = nums[0];
        int minBest = nums[0];
        int ans = nums[0];
        int sum = nums[0];
        int pAns = nums[0];

        for(int i=1; i<nums.length;i++){
            int v1 = nums[i];
            int v2 = nums[i]+maxBest;
            int v3 = nums[i]+minBest;
            sum = sum + nums[i];

            maxBest = Math.max(v1,v2);
            ans = Math.max(ans,maxBest);

            minBest = Math.min(v1,v3);
            pAns = Math.min(pAns,minBest);
            
        }
        if(ans < 0){
            return ans;
        }
        return Math.max(ans,sum-pAns);
    }
}