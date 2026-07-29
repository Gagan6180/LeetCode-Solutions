class Solution {
    public void reverseString(char[] s) {
        Stack<Character>rev = new Stack<>();

        for(char letter: s){
            rev.push(letter);
        }

        for(int i=0 ; i<s.length ; i++){
            s[i] = rev.pop();
        }
    }
}