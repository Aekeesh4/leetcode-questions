class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merge =new int[m+n];
        int i=0,j=0,k=0;
        while(i<m&& j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                merge[k++]=nums1[i++];
            }
            else
            {
                merge[k++]=nums2[j++];
            }
        }
        while(i<m)
        {
            merge[k++]=nums1[i++];
        }
        while(j<n)
        {
            merge[k++]=nums2[j++];

        }
        for(int x=0;x<m+n;x++)
        {
            nums1[x]=merge[x];
        }
    }

}