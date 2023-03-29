class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        for(int i=0,j=arr.length-1;i<=arr.length/2;i++,j--){
            if(arr[i]>arr[i+1])return i;
            if(arr[j]>arr[j-1])return j;
        }
        return 0;
        
    }
}
