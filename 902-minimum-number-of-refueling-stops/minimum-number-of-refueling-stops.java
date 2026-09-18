class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer>maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int i=0;
        int maxDistance = startFuel;
        int stops = 0;

        while(maxDistance < target){
            while(i < stations.length && stations[i][0] <= maxDistance){
                maxHeap.add(stations[i][1]);
                i++;
            }

            if(maxHeap.isEmpty()){
                return -1;
            }

            maxDistance += maxHeap.poll();
            stops++;
        }
        return stops;
    }
}