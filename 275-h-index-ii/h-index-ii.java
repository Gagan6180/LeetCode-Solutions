class Solution {
    public int hIndex(int[] citations) {
        int l =0;
        int h = citations.length-1;
        int n = citations.length;

        while(l<=h){
            int m =(l+h)/2;

            if(citations[m] == n-m){
                return n-m;
            }else if(citations[m] < n-m){
                l = m+1;
            }else{
                h = m-1;
            }
        }
        return n-l;
    }
}