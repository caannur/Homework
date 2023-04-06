class Solution {
    public void merge(int[] n1, int m, int[] n2, int n) {
        int i=m-1,j=n-1;
        int l=m+n-1;
        if(m==0){
            int t=0;
            while(t!=n){
                n1[t]=n2[t++];
            }
        }else if(n==0)return;
        else{
            while(l!=-1){
                if(i==-1){
                    while(j!=-1)
                      n1[l--]=n2[j--];
                }else if(j==-1){
                     while(i!=-1)
                      n1[l--]=n1[i--];
                }
                else{ 
                n1[l--] = n1[i]>n2[j]? n1[i--] : n2[j--];
                }
            }
        }
        
        
    }
}
