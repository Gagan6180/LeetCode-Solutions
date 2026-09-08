class Pair{
    String str;
    int freq;

    public Pair(String str, int freq){
        this.str = str;
        this.freq = freq;
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer>map = new HashMap<>();
        for(String s : words){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        PriorityQueue<Pair>minHeap = new PriorityQueue<>(
            (a,b)-> {
                if(a.freq != b.freq){
                    return a.freq-b.freq;
                }
                return b.str.compareTo(a.str);
            }
        );

        for(Map.Entry<String , Integer> entry : map.entrySet()){
            minHeap.offer(new Pair(entry.getKey(),entry.getValue()));

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        List<String>res = new ArrayList<>();
        while(!minHeap.isEmpty()){
            res.add(minHeap.poll().str);
        }
        Collections.reverse(res);
        return res;
    }
}