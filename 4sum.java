class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int length=nums.length;
        Arrays.sort(nums);
        int i;
        List<List<Integer>> result=new ArrayList();
        for(i=0;i<length;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            threeSum(Arrays.copyOfRange(nums,i+1,length),target-nums[i],nums[i],result);
        }
        return result;
    }
    
    
    public void threeSum(int[] nums, int target, int forthnum, List<List<Integer>> result) {
        int length=nums.length;
       
        if(length<3 ||nums==null)
            return ;
        int i;
        for(i=0;i<length;i++){
            int Min,Max;
            
            if(i>0 && nums[i]==nums[i-1])
                continue;
            
            Min=i+1;
            Max=length-1;
            
            while(Min<Max){
                if(nums[i]+nums[Min]+nums[Max]==target){
                    result.add(Arrays.asList(forthnum,nums[i],nums[Min],nums[Max]));
                    while(Min<Max && nums[Min]==nums[Min+1])
                        Min++;
                    while(Min<Max && nums[Max]==nums[Max-1])
                        Max--;
                    Min++;
                    Max--;
                }
                else if(nums[i]+nums[Min]+nums[Max]<target){
                    Min++;
                }
                else if(nums[i]+nums[Min]+nums[Max]>target){
                    Max--;
                }
            }
            
        }
        
    } 
}
    