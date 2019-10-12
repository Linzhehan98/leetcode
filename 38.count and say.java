class Solution {
    String[] s=new String[31];
    public String countAndSay(int n) {
        return find(n);
        
    }
    
    public String find(int n){
        if(n==1)
            return "1";
        String pre;
        String res="";
        
        if(s[n]!=null)
            return s[n];
        else if(s[n-1]!=null)
            pre=s[n-1];
        else
            pre=find(n-1);
        
        pre=find(n-1);
        int i=0;
        char tmp;
        int count=0;
        while(i<pre.length()){
            tmp=pre.charAt(i);
            count++;
            while(i+1<pre.length() && pre.charAt(i+1)==tmp){
                i++;
                count++;
            }
            res=res+count+tmp;
            i++;
            count=0;
        }
        s[n]=res;
        return res;
    }
}