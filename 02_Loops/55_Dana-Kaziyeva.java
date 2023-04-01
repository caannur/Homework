class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1)return true;
        if(nums[0]==0)return false;
        int l=0;
        boolean[] arr= new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            if(arr[nums.length-1]==true)
                return true;
            if(nums[i] + i>l && i<nums.length-1 && i<=l){
                int n=nums[i] + i -l;
                l+=n;if(nums.length-1<=l)
                    return true;
                while(n>-1){
                  arr[l-n]=true;
                  n--;
                }
            }
        }return false;
    }

}
