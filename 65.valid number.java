class Solution {
    public boolean isNumber(String s) {
        int length=s.length();
        String regex="[0-9e+-.\\s]*";
        if(!s.matches(regex))
            return false;
        String num1="^\\s*[+-]?[0-9]*(\\.)?[0-9]+\\s*$";
        String num2="^\\s*[+-]?[0-9]+(\\.)?[0-9]*\\s*$";
        String withe1="^\\s*[+-]?[0-9]+(\\.)?[0-9]*e[+-]?[0-9]+\\s*$";
        String withe2="^\\s*[+-]?[0-9]*(\\.)?[0-9]+e[+-]?[0-9]+\\s*$";
        if(s.matches(num1) || s.matches(num2) || s.matches(withe1) || s.matches(withe2))
            return true;
        return false;
    }
}