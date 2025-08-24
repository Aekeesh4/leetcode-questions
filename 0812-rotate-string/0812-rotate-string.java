class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()||s.length()==0)
        {
            return false;
        }
        String a=s+s;
        return a.contains(goal);
    }

}