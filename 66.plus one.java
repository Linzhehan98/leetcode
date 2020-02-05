class Solution {
    public int[] plusOne(int[] digits) {
        int i,j;
        for(i=digits.length-1;i>=0;i--){
            if(i==0 & digits[0]==9){
                int[] nd=new int[digits.length+1];
                nd[0]=1;
                for(j=1;j<digits.length+1;j++){
                    nd[j]=0;
                }
                return nd;
            }
            digits[i]++;
            if(digits[i]!=10)
                break;
            else
                digits[i]=0;
        }
        return digits;
    }
}