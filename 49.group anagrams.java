import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Hashtable<String,List<String>> h=new Hashtable();
        List<List<String>> result=new ArrayList();
        for(String s:strs){
            char[] k=s.toCharArray();
            Arrays.sort(k);
            String ns=String.valueOf(k);
            if(h.containsKey(ns)){
                List l=h.get(ns);
                l.add(s);
            }
            else{
                List<String> nl=new ArrayList();
                nl.add(s);
                h.put(ns,nl);
            }
        }
        for(List<String> v:h.values()){
            result.add(v);
        }
        return result;
    }
}