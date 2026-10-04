class Solution {
    public int differenceOfSum(int[] nums) {
        int sum =0;

        for(int num: nums){
            sum+=num;
        }

        int sum1 = digitSum(nums);
        return Math.abs(sum-sum1);
    }
    private int digitSum(int [] nums){
        int sum =0;

        for(int i=0; i<nums.length; i++){
            int sum1 =0;
            if(nums[i]>=10){
                while(nums[i] != 0){
                    int digit = nums[i]%10;
                    sum1+=digit;
                    nums[i]=nums[i]/10;
                }
                sum+=sum1;
            }
            sum+=nums[i];
        }
        return sum;
    }
}