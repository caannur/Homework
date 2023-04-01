//First way
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int least=Integer.MAX_VALUE,mid=Integer.MAX_VALUE;
        for(int num: nums){
            if(num<=least) least=num;
            else if(num<=mid) mid=num;
            else return true;
        }
        return false;
    }
}

// Second way
// class Solution {
//     public boolean increasingTriplet(int[] nu) {
//        int n=nu.length, min=Integer.MAX_VALUE;
//        int[] suf = new int[nu.length];
//        suf[n-1]=nu[n-1];
//        for(int i=n-2;i>=0;i--){
//            suf[i]=Math.max(suf[i+1], nu[i]);
//        }
//        for(int i=0; i<n-1;i++){
//         if(min<nu[i] && nu[i]<suf[i+1])return true;
//          min=Math.min(min,nu[i]);
// }return false;    
// }
// }
