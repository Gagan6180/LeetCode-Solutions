class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : stones){
            maxHeap.add(num);
        }

        while(maxHeap.size() > 1){
            int f = maxHeap.poll(); // first element is poll 
            int s = maxHeap.poll(); // second element is poll

            if(f != s){
                maxHeap.add(f-s);
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}