/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> bst=new ArrayList<Integer>();
    List<Integer> nbst=new ArrayList<Integer>();
    public void recoverTree(TreeNode root) {
        traversal(root);
        
        bst.sort(Comparator.comparing(Integer::valueOf));
        int i;
        for(i=0;i<bst.size();i++){
            if((int)bst.get(i)!=(int)nbst.get(i))
                break;
        }
        int a=(int)bst.get(i);
        int b=(int)nbst.get(i);
        swap(root,(int)bst.get(i),(int)nbst.get(i));
    }
    
    public void traversal(TreeNode root){
        if(root.left!=null)
            traversal(root.left);
        bst.add(root.val);
        nbst.add(root.val);
        if(root.right!=null)
            traversal(root.right);
    }
    
    public void swap(TreeNode root,int x,int y){
        TreeNode xnode=find(root,x);
        TreeNode ynode=find(root,y);
        
        
        xnode.val=y;
        ynode.val=x;        
    }
    public TreeNode find(TreeNode root,int x){
        TreeNode tmp;
        if(root.val==x){
            return root;
        }  
        else{
            if(root.left!=null){
                tmp=find(root.left,x);
                if(tmp!=null){
                    return tmp;
                }
                else{
                    if(root.right!=null){
                        tmp=find(root.right,x);
                        if(tmp!=null)
                            return tmp;
                        else 
                            return null;
                    }
                    else 
                        return null;
                }
            }
            else{
                if(root.right!=null){
                        tmp=find(root.right,x);
                        if(tmp!=null)
                            return tmp;
                        else 
                            return null;
                    }
                    else 
                        return null;
            }
        }
    }
}

