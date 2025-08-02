class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Compare current element with the next (circularly)
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        // Valid if there's at most one drop in order
        return count <= 1;
    }
}