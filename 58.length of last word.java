class Solution {
    public int lengthOfLastWord(String s) {
        int length=s.length();
        if(length==0)
            return 0;
        int i=length-1;
        int count=0;
        while(s.charAt(i)==' ' && i>0){
            i--;
        }
        if(i==0 && s.charAt(i)==' ')
            return 0;
        else if(i==0)
            return 1;
            
        while(s.charAt(i)!=' ' && i>=0){
            count++;
            if(i==0)
                break;
            i--;
            
        }
        return count;
    }
    
}