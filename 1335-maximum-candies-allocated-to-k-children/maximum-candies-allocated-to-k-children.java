class Solution {
    public int maximumCandies(int[] candies, long k) {
       int max = 0;

       for(int i=0; i<candies.length; i++){
        if(candies[i] > max){
            max = candies[i];
        }
       }

       int l = 1;
       int h = max;
       int ans = 0;

       while(l<=h){

        int m = l+(h-l)/2;
        long count =0;
        for(int j=0; j<candies.length; j++){
            count += candies[j]/m;
        }

        if(count >= k){
            ans = m;
            l = m+1;
        }else{
            h = m-1;
        }
       }
       return ans;
    }
}