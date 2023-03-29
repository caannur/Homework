public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        int min=strs[0].length();
		if (len == 0)
			return "";
		for (int j = 0; j < min; ++j) 
			for (int i = 1; i < len; ++i) 
				if (j==strs[i].length() || strs[0].charAt(j) != strs[i].charAt(j)) 
					return strs[0].substring(0, j);
		return strs[0].substring(0, min);
    }
}
