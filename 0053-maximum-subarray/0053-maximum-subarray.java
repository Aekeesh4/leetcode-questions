class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum=nums[0];
        int maxsofar=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            currentsum=Math.max(nums[i],currentsum+nums[i]);
            maxsofar=Math.max(currentsum,maxsofar);
        }
        return maxsofar;
    }
}