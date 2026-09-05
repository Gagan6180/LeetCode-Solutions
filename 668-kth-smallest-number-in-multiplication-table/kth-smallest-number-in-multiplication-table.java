class Solution {
    public int findKthNumber(int m, int n, int k) {
        int l = 1;
        int h = n*m;

        while(l<=h){
            int mid = (l+h)/2;

            if(position(m,n,mid) >= k){
                h = mid-1;
            }else{
                l = mid +1;
            }
        }
        return l;
    }
    private int position(int m, int n, int k){
        int count =0;

        for(int i=1; i<=m; i++){
            count += Math.min(k/i,n);
        }
        return count;
    }
}