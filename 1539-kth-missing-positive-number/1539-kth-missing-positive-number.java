class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int missingCount = 0;
        int prev = 0; // start from 0 so we can count missing from 1
        
        for (int num : arr) {
            int gap = num - prev - 1; // numbers missing between prev and num
            if (missingCount + gap >= k) {
                return prev + (k - missingCount);
            }
            missingCount += gap;
            prev = num;
        }
        
        // If kth missing is beyond the last element
        return arr[n - 1] + (k - missingCount);
    }
}