class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").trim().toLowerCase();
        if(s==" " || s.length()==1) return true;
        else{
            for(int i=0,j=s.length()-1; i<s.length()/2;i++,j--){
                if(s.charAt(i)!=s.charAt(j))  return false;
            }
       return true;
        }
    }
}
