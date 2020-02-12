class Solution {
    public int removeDuplicates(int[] nums) {
        int i;
        if(nums.length==0)
            return 0;
        int prenum=nums[0];
        int count=0;
        int mode=0;
        for(i=0;i<nums.length;i++){
            if(prenum==nums[i] && mode<2){
                mode++;
                nums[count]=nums[i];
                count++;
                continue;
            }                
            else if(prenum==nums[i] && mode>=2){
                mode++;
            }
            else{
                nums[count]=nums[i];
                prenum=nums[i];
                count++;
                mode=1;
            }
        }
        return count;
    }
}