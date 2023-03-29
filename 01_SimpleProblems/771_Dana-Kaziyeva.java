class Solution {
    public int numJewelsInStones(String s1, String s2) {//jewels, stones
        int ans = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s1.indexOf(s2.charAt(i)) != -1) ans++;
        }
        return ans;
    }
}
