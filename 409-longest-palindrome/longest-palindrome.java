class Solution {
    public int longestPalindrome(String s) {
        int n =s.length();
        int count =0;
        HashMap<Character,Integer>map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        boolean flage = false;
        for(int freq : map.values()){
            if(freq % 2 == 0){
                count += freq;
            }else{
                count += freq-1;
                flage = true;
            }
        }
        return flage ? count+1 : count;
        
    }
}