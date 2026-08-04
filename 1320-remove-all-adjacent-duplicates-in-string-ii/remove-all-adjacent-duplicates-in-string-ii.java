class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character>str = new Stack<>();
        Stack<Integer>count = new Stack<>();

        int n =s.length();
        for(int i=0; i<n ;i++){
            char ch = s.charAt(i);

            if(!str.isEmpty() && str.peek() == ch){
                count.push(count.peek()+1);
            }else{
                count.push(1);
            }
            str.push(ch);

            if(count.peek() == k){
                for(int j=0 ;j<k ;j++){
                    str.pop();
                    count.pop();
                }
            }
        }
        StringBuilder res = new StringBuilder();
        while(!str.isEmpty()){
            res.append(str.pop());
        }
        return res.reverse().toString();
    }
}