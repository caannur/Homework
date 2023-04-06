class NumArray {
      int[] arr;
    public NumArray(int[] nums) {
        arr = new int[nums.length];
        arr[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            arr[i] = arr[i-1] + nums[i];
            
        }
        
    }
    
    public int sumRange(int left, int right) {
        int n=arr[right];
        if(left==0 && right==0)return arr[right];
        if(left==0 && right!=0)return arr[right];
        return arr[right]-arr[left-1];
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
