class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n= nums.length;
        int[]ans = new int[n];
        Arrays.fill(ans,-1); //initially filling the ans array with -1;
        Stack<Integer> st= new Stack<>();

        for(int i =2*n -1; i>=0;i--){
            int num=nums[i%n];
            while(!st.isEmpty()&& st.peek()<=num){
                st.pop();
            }
            //we are checking i < n for valid indecis in first exampty as we have increased the array till 5th index but valid and use ful insex are just 0 1 and 2 
            if( i<n && !st.isEmpty()){
                ans[i]=st.peek();
            }
            st.push(num);
            
        }
        return ans;
    }
}