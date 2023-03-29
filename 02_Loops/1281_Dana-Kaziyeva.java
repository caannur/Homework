class Solution {
    public int subtractProductAndSum(int n) {
        int p=0, s=1;
        while(n>0){
            p+=n%10;
            s*=n%10;
            n=n/10;
            
        }
        return s-p;
    }
}
