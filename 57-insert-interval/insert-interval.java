class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int n = intervals.length;
        List<int[]>res1 = new ArrayList<>();

        boolean flag = false;
        for(int i=0 ;i<n; i++){
            if(!flag && newInterval[0] < intervals[i][0]){
                res1.add(newInterval);
                flag = true;
            }
            res1.add(new int []{intervals[i][0],intervals[i][1]});
        }
        if(!flag){
            res1.add(newInterval);
        }

        List<int[]>res2 = new ArrayList<>();

        int s1 = res1.get(0)[0];
        int e1 = res1.get(0)[1];

        for(int i=1; i<res1.size(); i++){
            int s2 = res1.get(i)[0];
            int e2 = res1.get(i)[1];

            if(e1 >= s2){
                s1 = s1;
                e1 = Math.max(e1,e2);
                continue;
            }
            res2.add(new int [] {s1,e1});
            s1 = s2;
            e1 = e2;
        }
        res2.add(new int [] {s1,e1});

        return res2.toArray(new int [res2.size()][]);

    }
}