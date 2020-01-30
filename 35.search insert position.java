class Solution {
    public int searchInsert(int[] nums, int target) {
        int len=nums.length;
        int i;
        for(i=0;i<len;i++){
            if(target<=nums[i])
                return i;
        }
        return len;
    }
}