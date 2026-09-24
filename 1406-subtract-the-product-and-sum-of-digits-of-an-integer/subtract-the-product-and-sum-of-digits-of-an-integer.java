class Solution {
    public int subtractProductAndSum(int n) {
        int length = (n == 0) ? 1 : (int) Math.log10(n) + 1;

        int [] arr = new int[length];

        for(int i=arr.length-1; i>=0; i--){
            arr[i] = n%10;
            n = n/10;
        }

        Arrays.toString(arr);

        int s= 0;
        int p= 1;

        for(int i=0; i<arr.length; i++){
            s += arr[i];
            p *= arr[i];
        }

        int ans = p-s;

        return ans;
    }
}