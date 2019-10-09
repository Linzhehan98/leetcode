class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int length=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList();
        if(length<3 ||nums==null)
            return result;
        int i;
        for(i=0;i<length;i++){
            int Min,Max;
            if(nums[i]>0)
                break;
            if(i>0 && nums[i]==nums[i-1])
                continue;
            
            Min=i+1;
            Max=length-1;
            
            while(Min<Max){
                if(nums[i]+nums[Min]+nums[Max]==0){
                    result.add(Arrays.asList(nums[i],nums[Min],nums[Max]));
                    while(Min<Max && nums[Min]==nums[Min+1])
                        Min++;
                    while(Min<Max && nums[Max]==nums[Max-1])
                        Max--;
                    Min++;
                    Max--;
                }
                else if(nums[i]+nums[Min]+nums[Max]<0){
                    Min++;
                }
                else if(nums[i]+nums[Min]+nums[Max]>0){
                    Max--;
                }
            }
            
        }
        return result;
    }
}