class Solution {
    public int maximumSum(int[] arr) {
        int max_nodel = arr[0];
        int max_onedel = -1;
        int res = arr[0];

        

        for(int i=1;i<arr.length;i++){

            int v3;

            if(max_onedel == -1){
                v3 = max_nodel;
            }
            v3 = max_onedel + arr[i];

            max_onedel = Math.max(v3,max_nodel);

            int v1 = arr[i];
            int v2 = max_nodel + arr[i];

            max_nodel = Math.max(v1,v2);


            res = Math.max(res,Math.max(max_nodel , max_onedel));
        }
        return res;
    }
}