class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // 0ms
        int n=stones.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(jewels.indexOf(stones.charAt(i))>-1) count++;
        }
        return count;

        // 1ms
        // int res = 0;
        // Set<Character> set = new HashSet<>();
        // for(char j: jewels.toCharArray()){
        //     set.add(j);
        // }
        // for(char j: stones.toCharArray()){
        //     if(set.contains(j)) res++;
        // }
        // return res;
    }
}
