public class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeakIndex(mountainArr);
        
        // Search in the ascending part
        int index = binarySearch(mountainArr, target, 0, peak, true);
        if (index != -1) return index;
        
        // Search in the descending part
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    // Find peak index using binary search
    private int findPeakIndex(MountainArray arr) {
        int left = 0, right = arr.length() - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) < arr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    // Binary search with direction flag
    private int binarySearch(MountainArray arr, int target, int left, int right, boolean ascending) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int val = arr.get(mid);
            if (val == target) return mid;
            if (ascending) {
                if (val < target) left = mid + 1;
                else right = mid - 1;
            } else {
                if (val > target) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
}