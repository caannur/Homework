class Solution {
    public boolean isRectangleOverlap(int[] r1, int[] r2) {
        if(Math.min(r1[2],r2[2])>Math.max(r1[0],r2[0]) && Math.min(r1[3],r2[3])>Math.max(r1[1],r2[1])) return true;
        else return false;

    }
}
