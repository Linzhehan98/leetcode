class Solution {
    public int longestValidParentheses(String s) {
        int stack=0;
        int length=s.length();
        int ltrmax=0;
        int rtlmax=0;
        int count=0;
        int i=0;
        int start;
        int end;
        if(length==0)
            return 0;
        while(i<length && s.charAt(i)==')')
            i++;
        start=i;
        i=length-1;
        while(i>=0 && s.charAt(i)=='(')
            i--;
        end=i;
        for(i=start;i<=end;i++){
            if(s.charAt(i)=='('){
                stack++;
                count++;
            }
            else{
                if(stack>0){
                    stack--;
                    count++;  
                }
                else if(stack==0){
                    count=0;
                }
            }
            if(stack==0 && count>ltrmax)
                ltrmax=count;               
        }
        count=0;
        stack=0;
        for(i=end;i>=start;i--){
            if(s.charAt(i)==')'){
                stack--;
                count++;
            }
            else{
                if(stack<0){
                    stack++;
                    count++;  
                }
                else if(stack==0){
                    count=0;
                }
            }
            if(stack==0 && count>rtlmax)
                rtlmax=count;               
        }
        
        if(ltrmax>rtlmax)
            return ltrmax;
        else
            return rtlmax;
    }
}