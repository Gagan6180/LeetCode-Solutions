class Solution {
    public int splitArray(int[] arr, int k) {
        if (arr.length < k) { 
            return -1; 
        } 

        int max = 0; 
        long totalSum = 0; 

        for (int i = 0; i < arr.length; i++) { 
            totalSum += arr[i]; 
            max = Math.max(arr[i], max); 
        } 

        int l = max; 
        int h = (int) Math.min(totalSum, Integer.MAX_VALUE); 
        int res = -1; 

        while (l <= h) { 
            int m = l + (h - l) / 2; 

            if (fun(arr, k, m)) { 
                res = m; 
                h = m - 1; 
            } else { 
                l = m + 1; 
            } 
        } 
        return res; 
    } 

    
    boolean fun(int[] arr, int k, int limit) { 
        long page = 0; 
        int std = 1; 

        for (int i = 0; i < arr.length; i++) { 
            if (page + arr[i] <= limit) { 
                page += arr[i]; 
            } else { 
                std++; 
                page = arr[i]; 

                if (std > k) { 
                    return false; 
                } 
            } 
        } 
        return true; 
    }
}