class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int posIdx = 0; // even indices for positives
        int negIdx = 1; // odd indices for negatives

        for (int num : nums) {
            if (num > 0) {
                res[posIdx] = num;
                posIdx += 2;
            } else {
                res[negIdx] = num;
                negIdx += 2;
            }
        }
        return res;
    }
}