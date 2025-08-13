class Solution {
    public int findPeakElement(int[] nums) {
         int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // Peak is to the right
                start = mid + 1;
            } else {
                // Peak is to the left or could be mid
                end = mid;
            }
        }

        // left == right is the peak index
        return start;
    }

}