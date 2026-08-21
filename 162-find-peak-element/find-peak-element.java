class Solution {
    public int findPeakElement(int[] nums) {
        int s =0;
        int e = nums.length-1;

        while(s<e){

            int m = (s+e)/2;

            if(nums[m+1] > nums[m]){
                s = m+1;
            }else{
                e = m;
            }
        }
        return s;
    }
}