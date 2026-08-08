class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        if(ransomNote.length() > magazine.length()){
            return false;
        }
        HashMap<Character,Integer>map = new HashMap<>();

        for(char ch : magazine.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch : ransomNote.toCharArray()){
            int Ccount = map.getOrDefault(ch,0);

            if(Ccount <= 0){
                return false;
            }
            map.put(ch,Ccount-1);
        }
        return true;
    }
}