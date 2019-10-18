class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=0;
        int i=0;
        while(nums[i]<=0){
            max=max+nums[i];
            //sum=sum+nums[i];
            if(i<nums.length-1)
                i++;
            else
                break;
        }
        if(i==nums.length-1 && nums[i]<0){
            Arrays.sort(nums);
            return nums[i];
        }            
        for(i=i;i<nums.length;i++){
            if(nums[i]<0 && max<sum)
                max=sum;
            sum=sum+nums[i];
            if(sum<0){
                sum=0;
            }
            if(i==nums.length-1 && max<sum)
                max=sum;
        }
        return max;
    }
}