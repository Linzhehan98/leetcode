class Solution {
    public int removeElement(int[] nums, int val) {
        int length=nums.length;
        int c=0;
        int min=0;
        int max=length-1;
        while(min<=max){
            if(nums[max]==val){
                max--;
                c++;
                continue;
            }
            if(nums[min]==val){
                swap(nums,min,max);
                c++;
                max--;
            }
            min++;
        }
        return length-c;
    }
    
    public void swap(int[] nums,int f,int b){
        int tmp;
        tmp=nums[f];
        nums[f]=nums[b];
        nums[b]=tmp;
    }
}