class Solution {
    public int lengthOfLongestSubstring(String s) {

        //hashmap
        
        HashMap<Character,Integer>map = new HashMap<>();
        int left =0;
        int max =-1;
        if(s.length() == 0){
            return 0;
        }
        for(int right=0;right<s.length();right++){
            char rightChar = s.charAt(right);
            map.put(rightChar,map.getOrDefault(rightChar,0)+1);


            while(map.size() < right-left+1){
                char leftChar = s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);
    
                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
        
    }
}