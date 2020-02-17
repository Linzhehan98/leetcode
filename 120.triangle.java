class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int i,j;
        for(i=1;i<n;i++){
            for(j=0;j<=i;j++){
                if(j!=0 && j!=i){
                    triangle.get(i).set(j,triangle.get(i).get(j)+getMin(triangle.get(i-1).get(j-1),triangle.get(i-1).get(j)));
                }
                else if(j==0){
                    triangle.get(i).set(j,triangle.get(i).get(j)+triangle.get(i-1).get(j));
                }
                else if(j==i){
                    triangle.get(i).set(j,triangle.get(i).get(j)+triangle.get(i-1).get(j-1));
                }
            }
            
        }
        List last=triangle.get(n-1);
        last.sort(Comparator.naturalOrder());
        return (int)last.get(0);
    }
    public int getMin(int x,int y){
        if(x<y)
            return x;
        else
            return y;
    }
}