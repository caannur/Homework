class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            if(set.contains(i))return true;
            set.add(i);
        }
        if(set.size()!= nums.length)return true;
        else return false;
    }
}
