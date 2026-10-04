class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for(int i=0; i<nums.length; i++){
            elementSum+=nums[i];

            int hold = nums[i];
            while(hold > 0){
                int digit = hold%10;
                digitSum += digit;
                hold /= 10;
            }
        } 
        return Math.abs(elementSum - digitSum);
    }
}