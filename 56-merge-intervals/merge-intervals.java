class Solution {
    public int[][] merge(int[][] intervals) {

        List< int[] >res = new ArrayList<>();
        int n = intervals.length;

        if(n == 0){
            return new int [][]{};
        }

        Arrays.sort(intervals,(x,y) -> Integer.compare(x[0],y[0]));

        int s1 = intervals[0][0];
        int e1 = intervals[0][1];

        for(int i=1 ; i<n; i++){
            int s2 = intervals[i][0];
            int e2 = intervals[i][1];

            if(e1 >= s2){
                s1 = s1;
                e1 = Math.max(e1,e2);
                continue;
            }
            res.add(new int []{s1,e1});
            s1 = s2;
            e1 = e2;
        }
        res.add(new int []{s1,e1});

        return res.toArray(new int [res.size()][]);
    }
}