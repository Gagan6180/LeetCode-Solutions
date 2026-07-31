class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character>map = new HashMap();

        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        Stack<Character>str = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(map.containsKey(ch)){
                if(!str.isEmpty() && map.get(ch) == str.peek()){
                    str.pop();
                }
                else{
                    return false;
                }
            }else{
                str.push(ch);
            }

        }
        return str.isEmpty();
        
    }
}