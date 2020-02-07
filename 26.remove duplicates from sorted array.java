class Solution {
    public int removeDuplicates(int[] nums) {
        int i;
        if(nums.length==0)
            return 0;
        int prenum=nums[0];
        int count=1;
        for(i=0;i<nums.length;i++){
            if(prenum==nums[i])
                continue;
            else{
                nums[count]=nums[i];
                prenum=nums[i];
                count++;
            }
        }
        return count;
    }
}