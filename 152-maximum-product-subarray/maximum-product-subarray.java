class Solution {
    public int maxProduct(int[] nums) {
        int maxEnd = nums[0];
        int minEnd = nums[0];
        int ans = nums[0];

        for(int i=1;i<=nums.length-1;i++){

            int v1 = nums[i];
            int v2 = nums[i]*maxEnd;
            int v3 = nums[i]*minEnd;

            int best = Math.max(v2,v3);
            int best1 = Math.min(v2,v3);

            maxEnd = Math.max(v1,best);
            minEnd = Math.min(v1,best1);

            int pAns = Math.max(maxEnd,minEnd);
            ans = Math.max(ans,pAns);

        }
        return ans;
    }
}