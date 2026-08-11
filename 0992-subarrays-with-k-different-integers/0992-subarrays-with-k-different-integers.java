class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

        return atMostK(nums, k) - atMostK(nums, k - 1);
    }
         public int atMostK(int[] nums, int k) {

         Map <Integer,Integer> map=new HashMap<>();
         int left=0;
         int count =0;
         for(int right =0;right<nums.length;right++)
         {
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()>k)
            {
                int leftnum=nums[left];
                map.put(leftnum,map.get(leftnum)-1);

                if(map.get(leftnum)==0)
                {
                    map.remove(leftnum);
                }
                left++;
            }

            count+=right-left+1;

         }

    return count;
         }
}