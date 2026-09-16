class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer>map = new HashMap<>();
        for(char c : tasks){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Integer>maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(map.values());

        Queue <int []> que = new LinkedList<>();
        int time =0;

        while(!maxHeap.isEmpty() || !que.isEmpty()){
            time++;

            if(!maxHeap.isEmpty()){
                int count = maxHeap.poll()-1;

                if(count > 0){
                    que.add(new int []{count,time+n});
                }
            }

            if(!que.isEmpty() && que.peek()[1] == time){
                maxHeap.add(que.poll()[0]);
            }
        }
        return time;
    }
}