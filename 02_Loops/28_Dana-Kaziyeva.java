class Solution {
    public int strStr(String haystack, String needle) {
        int n=needle.length();
        boolean b=true;
        for(int i=0;i<haystack.length()-n+1;i++){
            if(haystack.substring(i,i+n).equals(needle)) {
                b=false; 
                return i;}
        }
        return -1;
    }
}
