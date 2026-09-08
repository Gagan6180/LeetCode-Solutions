class Pair{
    int ele;
    int freq;

    public Pair(int ele,int freq){
        this.ele = ele;
        this.freq = freq;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer>map = new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Pair>minHeap = new PriorityQueue<>(
            (a,b)->Integer.compare(a.freq,b.freq)
        );

        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            minHeap.add(new Pair(entry.getKey(),entry.getValue()));

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        int [] res = new int [k];
        for(int i=0; i<k; i++){
            res[i] = minHeap.poll().ele;
        }
        return res;
    }
}