class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //Arrays.sort(candidates,0,candidates.length);
        int i,j;
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<List<Integer>> tmp;
        for(i=0;i<candidates.length;i++){
            if(target<candidates[i])
                continue;
            else if(target==candidates[i]){
                List<Integer> num=new ArrayList<Integer>();
                num.add(target);
                result.add(num);
            }
            else{
                tmp=combinationSum(candidates,target-candidates[i]);
                if(!tmp.isEmpty()){
                    for(j=0;j<tmp.size();j++){
                        tmp.get(j).add(candidates[i]);
                        Collections.sort(tmp.get(j));
                        if(!result.contains(tmp.get(j))){
                            result.add(tmp.get(j));
                        }
                    }
                }
            }            
        }
        return result;
    }   
}