class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;

        for(int i=0; i<weights.length; i++){
            sum += weights[i];
            if(weights[i] > max ){
                max = weights[i];
            }
        }
        int l = max;
        int h = sum;

        while(l <= h){
            int mid = (l+h)/2;
            int noDays = noOfDays(weights,mid);

            if(noDays <= days){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
    private int noOfDays(int [] weights, int cap){
        int days = 1;
        int load = 0;

        for(int i=0; i<weights.length; i++){
            if(weights[i] + load > cap){
                days += 1;
                load = weights[i];
            }else{
                load += weights[i];
            }
        }
        return days;
    }
}