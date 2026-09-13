class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
         
        PriorityQueue<int[]>maxHeap = new PriorityQueue<>(
            (a,b)->{
                if(a[0] != b[0]){
                    return b[0]-a[0];
                }
                return b[1]-a[1];
            }
        );

        for(int i=0; i<mat.length; i++){
            int soldier = count(mat[i]);
            maxHeap.add(new int []{soldier,i});

            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }

        int [] res = new int [k];
        for(int i= k-1; i>=0; i--){
            res[i] = maxHeap.poll()[1];
        }
        return res;
    }
    private int count(int mat[]){
        int l = 0;
        int h = mat.length;

        while(l<h){
            int m = (l+h)/2;
            if(mat[m] == 1){
                l=m+1;
            }else{
                h=m;
            }
        }
        return l;
    }
}