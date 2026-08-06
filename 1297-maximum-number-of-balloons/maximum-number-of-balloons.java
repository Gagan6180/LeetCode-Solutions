class Solution {
    public int maxNumberOfBalloons(String text) {
        int n = text.length();
        HashMap<Character,Integer>map = new HashMap();

        for(char ch : text.toCharArray()){
            if(ch == 'b' || ch == 'a' || ch == 'l' || ch == 'o' || ch == 'n'){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }

        int bCount = map.getOrDefault('b',0);
        int aCount = map.getOrDefault('a',0);
        int lCount = map.getOrDefault('l',0)/2;
        int oCount = map.getOrDefault('o',0)/2;
        int nCount = map.getOrDefault('n',0);

        return Math.min(bCount,Math.min(aCount,Math.min(lCount,Math.min(oCount,nCount))));

    }
}