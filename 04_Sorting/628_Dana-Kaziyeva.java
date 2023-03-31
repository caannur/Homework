//First way
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
        return Math.max(nums[0] * nums[1] * nums[nums.length-1], max);
    }
}






// Second way

//         int maxA=Integer.MIN_VALUE;
//         int maxB=Integer.MIN_VALUE;
//         int maxC=Integer.MIN_VALUE;
//         int minA=Integer.MAX_VALUE;
//         int minB=Integer.MAX_VALUE;
        
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]>maxA)
//             {
//                 maxC=maxB;
//                 maxB=maxA;
//                 maxA=nums[i];
//             }

//             else if(nums[i]>maxB)
//             {
//                 maxC=maxB;
//                 maxB=nums[i];
//             }

//             else if(nums[i]>maxC)
//             {
//                 maxC=nums[i];
//             }

//             if(nums[i]<minA)
//             {
//                 minB=minA;
//                 minA=nums[i];
//             }

//             else if(nums[i]<minB)
//             {
//                 minB=nums[i];
//             }
//         }
//         return Math.max(maxA*maxB*maxC,minA*minB*maxA);
