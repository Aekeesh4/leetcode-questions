class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        for (int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if(numbers[j]==target-numbers[i])
                {
                    return  new int[]{i+1,j+1};
                }
            }
        }
        return null;
    }
}