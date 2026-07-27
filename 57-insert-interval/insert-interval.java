class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int n = intervals.length;

        int [][] res = new int [n+1][];

        for(int i=0; i<n ; i++){
            res[i] = intervals[i];
        }
        res[n] = newInterval; 

        Arrays.sort(res , (x,y) -> Integer.compare(x[0],y[0]));

        List<int[]>res1 = new ArrayList<>();

        if(res.length == 0){
            return new int [][]{};
        }

        int s1 = res[0][0];
        int e1 = res[0][1];

        for(int i=1; i<res.length; i++){
            int s2 = res[i][0];
            int e2 = res[i][1];

            if(e1 >= s2){
                s1 = s1;
                e1 = Math.max(e1,e2);
                continue;
            }
            res1.add(new int [] {s1,e1});
            s1 = s2;
            e1 = e2;
        }
        res1.add(new int [] {s1,e1});

        return res1.toArray(new int [res1.size()][]);

    }
}