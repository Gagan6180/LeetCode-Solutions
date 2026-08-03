class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>str = new Stack<>();

        int n = temperatures.length;
        int res [] = new int [n];

        for(int i=n-1 ;i>=0 ;i--){
            while(!str.isEmpty() && temperatures[i] >= temperatures[str.peek()] ){
                str.pop();
            }
            if(!str.isEmpty()){
                res[i] = str.peek()-i;
            }
            str.push(i);
        }
        return res;
    }
}