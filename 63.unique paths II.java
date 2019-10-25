class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m,n;
        m=obstacleGrid.length;
        n=obstacleGrid[0].length;
        if(m==0 || n==0)
            return 0;
        int[][] res=new int[m][n];
        int i,j;
        for(i=0;i<m;i++){
            if(obstacleGrid[i][0]==1){
                res[i][0]=0;
                break;
            }
            else
                res[i][0]=1;
        }   
        for(j=0;j<n;j++){
            if(obstacleGrid[0][j]==1){
                res[0][j]=0;
                break;
            }
            else
                res[0][j]=1;
        }
        for(i=1;i<m;i++){
            for(j=1;j<n;j++){
                if(obstacleGrid[i][j]==1)
                    res[i][j]=0;
                else
                    res[i][j]=res[i-1][j]+res[i][j-1];
            }
        }
        return res[m-1][n-1];
    }
}