class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Peak is to the right
                left = mid + 1;
            } else {
                // Peak is to the left or could be mid
                right = mid;
            }
        }

        // left == right is the peak index
        return left;
    }

}

