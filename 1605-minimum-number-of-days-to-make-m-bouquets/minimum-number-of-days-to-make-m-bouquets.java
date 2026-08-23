class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        long val = (long)m*k;
        if(val > bloomDay.length) return -1;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i=0; i<bloomDay.length; i++){
            min = Math.min(bloomDay[i],min);
            max = Math.max(bloomDay[i],max);
        }

        int s = min;
        int e = max;

        while(s<=e){
            int mid = (s+e)/2;

            if(possible(bloomDay,mid,m,k)){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return s ;
    }
    private boolean possible (int [] arr, int days, int m , int k){
        int count =0;
        int noBloom = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] <= days){
                count++;
            }else{
                noBloom+=(count/k);
                count =0;
            }
        }
        noBloom+=(count/k);
        return noBloom>=m;
    }
}