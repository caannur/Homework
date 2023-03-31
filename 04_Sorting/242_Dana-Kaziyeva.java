class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a1 = new int[26];
        if(s==null || t==null || s.length() != t.length())return false;
        for(int i=0;i<s.length();i++){
            a1[s.charAt(i)-'a']+=1;
            a1[t.charAt(i)-'a']-=1;
        }
         for(int i=0;i<26;i++)
            if(a1[i]!=0)return false;
        return true;
           

        
    }
}
