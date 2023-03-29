class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(new Integer[]{1}));
        if(n==1) return arr;
        arr.add(Arrays.asList(new Integer[]{1, 1}));
        if(n==2)return arr;
        else{
        for(int i=2;i<n;i++){
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for(int j=0;j<arr.get(i-1).size()-1;j++){
                cur.add(arr.get(i-1).get(j) + arr.get(i-1).get(j+1));
            }
            cur.add(1);
            arr.add(cur);
        }

        }
        return arr;
    }
}
