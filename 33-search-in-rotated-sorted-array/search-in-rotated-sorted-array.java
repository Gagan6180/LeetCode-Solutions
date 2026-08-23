class Solution {
    public int search(int[] nums, int target) {

        int s = 0;
        int e = nums.length-1;

        while(s<=e){
            int m = (s+e)/2;

            if(nums[m] == target){
                return m;
            }

            if(nums[nums.length-1] < nums[m]){ // part1

                if(nums[m] < target){
                    s = m+1;
                }else{
                    if(nums[0] > target){
                        s = m+1;
                    }else{
                        e = m-1;
                    }
                }
            }else{ //part2
                if(nums[m]>target){
                    e = m-1;
                }else{
                    if(nums[nums.length-1] < target){
                        e = m-1;
                    }else{
                        s = m+1;
                    }
                }
            }
        }
        return -1;
    }
}