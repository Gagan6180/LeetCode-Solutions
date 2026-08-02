class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;

        Stack<Integer>str = new Stack<>();
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i=n-1;i>=0 ;i--){
            int element = nums2[i];

            while(!str.isEmpty() && str.peek() <= element){
                str.pop();
            }
            
            if(str.isEmpty()){
                map.put(element,-1);
            }
            else{
                map.put(element,str.peek());
            }
            str.push(element);
        }
        int m = nums1.length;
        int [] ans = new int [m];
        for(int i=0 ; i<m ;i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}