class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < nums.length; i++){
            if(!pq.contains(nums[i]))
                pq.add(nums[i]);
        }

        if(pq.size() > 2){
            pq.poll();
            pq.poll();
        }

        return pq.poll();
    }
}
