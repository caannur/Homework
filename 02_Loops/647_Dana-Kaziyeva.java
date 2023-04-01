//First way
class Solution {
    public int countSubstrings(String s) {
        if(s.length()==1)return 1;
        int res=0;
        for(int i=0; i<s.length();i++){
            res++;
            String cur=s.charAt(i) +"", rev=s.charAt(i)+"";
            for(int j=i+1;j<s.length();j++){
                rev += s.charAt(j) + "";
                cur=s.charAt(j) + cur;
                if(cur.equals(rev))res++;
            }
        }
        return res;
    }
}

//Second way
// class Solution {
//     public int countSubstrings(String s) {
//         int n = s.length();
//         boolean [][] dp = new boolean[n][n];
//         int count = 0;
//         for(int k = n -1; k >= 0; k--)
//         {
//             for(int j = k; j < n; j++)
//             {
//                 if(s.charAt(k) == s.charAt(j) && (j - k < 2 || dp[k+1][j-1]))
//                 {
//                     dp[k][j] = true;
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }
