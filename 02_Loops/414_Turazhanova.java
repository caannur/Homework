import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
       int []nums2 = new int[nums.length];
        int index =0;
       for(int i=nums.length-1;i>=0;i--){
          
          nums2[index]=nums[i];
          index++;
       }
       
        
           int cnt=1;
           int prev=nums2[0];
        
           for(int i=0;i<nums.length;i++){
             
               if(prev!=nums2[i]){
                   cnt++;
                   prev=nums2[i];
               }
               if(cnt==3){
                return nums2[i];
               }

           }
           return nums2[0];
         
    }
}
