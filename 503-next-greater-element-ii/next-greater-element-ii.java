class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n]; // Fixed: Create an array to store results
        Stack<Integer> res = new Stack<>(); // The stack only holds the numbers

        // Loop twice (from 2*n-1 down to 0) to simulate the circular wrap-around
        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n; // Get the actual index in the array

            // Remove all smaller elements from the stack
            while (!res.isEmpty() && res.peek() <= nums[idx]) {
                res.pop();
            }

            // Fixed: Assign answers to the 'result' array instead of the stack
            if (res.isEmpty()) {
                result[idx] = -1;
            } else {
                result[idx] = res.peek(); // Fixed typo: changed 'rev' to 'res'
            }

            // Push the current element onto the stack
            res.push(nums[idx]);
        }

        return result; // Return the correct intege
    }
}