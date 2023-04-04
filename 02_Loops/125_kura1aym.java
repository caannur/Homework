class Solution {
    public boolean isPalindrome(String s) {
        String s2 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return s2.equals(new StringBuilder(s2).reverse().toString());
    }
}
