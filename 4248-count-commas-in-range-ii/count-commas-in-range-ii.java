class Solution {
    public long countCommas(long n) {
        long count = 0;
        long factor = 1000;
        
        while (n >= factor) {
            count += (n - factor + 1);
            factor *= 1000;
        }
        
        return count;
    }
}
