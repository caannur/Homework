class Solution {
    public int peakIndexInMountainArray(int[] a) {
        int i = 1, j = a.length - 2;

        while (i != j) {
            int mid = i + (j - i) / 2;
            if (a[mid] < a[mid+1]) i = mid + 1;
            else j = mid;
        }

        return i;   
    }
}
