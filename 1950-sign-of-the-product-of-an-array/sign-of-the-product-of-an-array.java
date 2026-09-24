class Solution {
    public int arraySign(int[] nums) {
        int p =1;

        for(int num : nums){
            if(num == 0){
                return 0;
            }
            if(num < 0){
                p *= -1;
            }
        }
        return p;
    }
}