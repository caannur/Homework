class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int i=0;
        while(s.length()-1-i!=-1 && s.charAt(s.length()-1-i)!=' ')
            i++;
        return i;     
    }
}
