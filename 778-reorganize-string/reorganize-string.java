class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        PriorityQueue<Character>maxHeap = new PriorityQueue<>(
            (a,b)-> Integer.compare(map.get(b),map.get(a))
        );
        maxHeap.addAll(map.keySet());

        StringBuilder res = new StringBuilder();
        Character prev = null;

        while(!maxHeap.isEmpty() || prev!=null){

            if(maxHeap.isEmpty() && prev!=null){
                return "";
            }
            char curr = maxHeap.poll();
            res.append(curr);
            map.put(curr,map.get(curr)-1);

            if(prev != null){
                maxHeap.offer(prev);
                prev = null;
            }

            if(map.get(curr) > 0){
                prev = curr;
            }
        }
        return res.toString();
    }
}