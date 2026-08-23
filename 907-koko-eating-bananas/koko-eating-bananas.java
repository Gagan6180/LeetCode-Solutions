class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int e = Integer.MIN_VALUE;
        int res = 0;

        for(int i=0; i<piles.length; i++){
            e = Math.max(e,piles[i]);
        }

        while(s <= e){
            int m = s+(e-s)/2;
            long t = noK(piles,m);

            if(t > h){
                s = m+1;
            }else{
                res = m;
                e = m-1;
            }
        }
        return res;
    }
    private long noK(int [] piles , int speed){

        long h = 0;
        for(int i=0; i<piles.length; i++){
            h = h + piles[i]/speed;

            if(piles[i] % speed != 0){
                h++;
            }
        }
        return h;
    }
}