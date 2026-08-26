class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int s =0;
        int e = position[position.length-1]-position[0];
        int ans =0;

        while(s <= e){
            int k = (s+e)/2;

            if(canWePlace(position,k,m)){
                ans = k;
                s = k+1;
            }else{
                e = k-1;
            }
        }
        return ans;
    }

    boolean canWePlace(int [] arr, int dist, int m){
        int count =1;
        int last = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]-last >= dist){
                count ++;
                last = arr[i];
            }
        }
        if(count >= m){
            return true;
        }else{
            return false;
        }
    }
}