class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer>maxHeap = new PriorityQueue<>(
            (a,b)->{
                int distA = Math.abs(a-x);
                int distB = Math.abs(b-x);

                if(distA != distB){
                    return distB-distA;
                }
                return b-a;
            }
        );

        for(int num: arr){
            maxHeap.add(num);

            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }

        List<Integer>res = new ArrayList<>(maxHeap);
        Collections.sort(res);
        return res;
    }
}