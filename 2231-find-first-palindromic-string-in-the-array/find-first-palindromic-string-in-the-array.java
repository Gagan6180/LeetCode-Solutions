class Solution {
    public String firstPalindrome(String[] words) {
        int i = 0;

        while(i<words.length){
            if(palindrom(words[i])){
                return words[i];
            }else{
                i++;
            }
        }
        return "";
    }
    private boolean palindrom(String s){
        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}