class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            if((candies[i]+extraCandies) >= max(candies)){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
    private int max(int [] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}