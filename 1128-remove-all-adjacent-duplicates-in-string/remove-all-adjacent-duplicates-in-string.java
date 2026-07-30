class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>str = new Stack<>();

        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);

            if(!str.isEmpty() && str.peek() == ch){
                str.pop();
            }
            else{
                str.push(ch);
            }
        }
        StringBuilder res = new StringBuilder();
        while(!str.isEmpty()){
            res.append(str.pop());
        }
        return res.reverse().toString();
    }
}