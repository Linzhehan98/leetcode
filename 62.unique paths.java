class Solution {
    public int uniquePaths(int m, int n) {
        if(m==0 || n==0)
            return 0;
        
        int[][] res=new int[m][n];
        int i,j;
        for(i=0;i<m;i++)
            res[i][0]=1;
        for(j=0;j<n;j++)
            res[0][j]=1;
        for(i=1;i<m;i++){
            for(j=1;j<n;j++){
                res[i][j]=res[i-1][j]+res[i][j-1];
            }
        }
        return res[m-1][n-1];
       
    }
}