class NumArray {
    int N[];
    public NumArray(int[] n) {
        int l = n.length;
        N = new int[l];
        N[0] = n[0];
        for(int i = 1; i < l; i++){
            N[i] = n[i] + N[i-1]; 
        }
    }
    public int sumRange(int l, int r) {
        if(l == 0) return N[r];
        return (N[r] - N[l-1]);
    }
}
//-2 -2 1 -4 -2 -3
