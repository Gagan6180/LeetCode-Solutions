class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int [][] merge = new int [capital.length][2];

        for(int i=0; i<capital.length; i++){
            merge[i][0] = capital[i];
            merge[i][1] = profits[i];
        }

        Arrays.sort(merge,(a,b) -> Integer.compare(a[0],b[0]));

        PriorityQueue<Integer>maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int i=0;
        while(k-- > 0){
            while(i < profits.length && merge[i][0] <= w){
                maxHeap.add(merge[i][1]);
                i++;
            }
            if(maxHeap.isEmpty()){
                break;
            }
            w += maxHeap.poll();
        }
        return w;
    }
}