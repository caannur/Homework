class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int ans = 0;
        int ind = s.lastIndexOf(' ');
        if(ind == n - 1){
            for (int i = n - 1; i >= 0; i--) {
                if(s.charAt(i) != ' '){
                    ans++;
                }else if(ans > 0){
                    return ans;
                }
            }
        }else ans = n - 1 - ind;
        return ans;
    }
}
