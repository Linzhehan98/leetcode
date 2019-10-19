class Solution {
    public boolean canJump(int[] nums) {
        int i;
        int length=nums.length;
        boolean can=true;
        int index=length-1;
        while(index>0){
            can=false;
            for(i=0;i<index;i++){
                if(nums[i]>=index-i){
                    index=i;
                    can=true;
                    break;
                }
            }
            if(can==false)
                return false;
        }
        return true;     
    }
}