
class Pair{
    int first;
    int second;

    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue <Pair> maxHeap = new PriorityQueue<>(
            (a,b)->{
                int distA = (a.first*a.first) + (a.second*a.second);
                int distB = (b.first*b.first) + (b.second*b.second);

                if(distA != distB){
                    return Integer.compare(distB,distA);
                }
                return Integer.compare(b.first,a.first);
            }
        );

        for(int [] row : points){
            maxHeap.add(new Pair(row[0],row[1]));

            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }

        int [][] res = new int [k][2];
        for(int i=0; i<k; i++){
            Pair p = maxHeap.poll();
            res[i][0] = p.first;
            res[i][1] = p.second;
        }
        return res;
    }
}