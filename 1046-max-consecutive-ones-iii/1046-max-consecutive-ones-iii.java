class Solution {
    public int longestOnes(int[] arr, int k) {
        int l = 0, r = 0;
        int n = arr.length;
        int count = 0;
        int maxi = Integer.MIN_VALUE;

        while (r < n) {
            if (arr[r] == 0) count++;

            while (count > k) {
                if (arr[l] == 0) count--;
                l++;
            }

            maxi = Math.max(r - l + 1, maxi);
            r++;
        }

        return maxi;
    }
}