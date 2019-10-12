class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==-2147483648 && divisor==-1){
            return 2147483647;
        }
        if(divisor==-2147483648){
            if(dividend==-2147483648)
                return 1;
            else
                return 0;
        }
        String dividend_s=String.valueOf(dividend);
        int M=0;
        int N=0;
        if(divisor<0){
            N=1;
            divisor=-divisor;
        }
        int[] dend=new int[dividend_s.length()];
        if (dividend<0){
            M=1;
            for(int i=0;i<dividend_s.length()-1;i++){
                dend[i]=dividend_s.charAt(i+1)-'0';
            }
        }else{
            for(int i=0;i<dividend_s.length();i++){
                dend[i]=dividend_s.charAt(i)-'0';
            } 
        }
        
        int[] result=new int[32];
        int index=0;
        int tmp=0;
        int i=0;
        int j=0;
        int res=0;
        
        for(i=index;i<dend.length-M;i++){
            if(tmp==214748364 && dend[i]==8){
                tmp=2147483647-divisor+1;
                result[j]=1;
            }else{
                tmp=tmp*10+dend[i];
                result[j]=0;
            }
            
            while(tmp>=divisor){
                tmp=tmp-divisor;
                result[j]++;
            }
            j++;
            if(j==1 && result[0]==0)
                j--;
        }
        for(i=0;i<j;i++){
            res=res*10+result[i];
        }
        if(M-N!=0)
            res=-res;
        return res;
    }
}