class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;

        int l = matrix[0][0];
        int h = matrix[n-1][m-1];
        int ans = -1;

        while(l <= h){
            int mid = (l+h)/2;
            int kth = fun(matrix,mid);

            if(kth >= k){
                ans = mid;
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
    private int fun(int [][] matrix, int k){
        int n = matrix.length;
        int m = matrix[0].length;

        int r = n-1;
        int c = 0;
        int cl = 0;

        while(r >= 0 && cl < m){
            if(matrix[r][cl] <= k){
                c += r + 1;
                cl ++;
            }else{
                r --;
            }
        }
        return c;
    }
}