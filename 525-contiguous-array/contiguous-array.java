class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer>map = new HashMap();

        int zero= 0;
        int one= 0;
        int maxLen= 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                zero++;
            }else{
                one++;
            }

            int diff = zero-one;

            if(diff==0 ){
                maxLen = Math.max(maxLen,i+1);

            }else if(map.containsKey(diff)){
                maxLen = Math.max(maxLen,i-map.get(diff));
                
            }else{
                map.put(diff,i);
            }
        }
        return maxLen;
    }
}