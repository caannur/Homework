class Solution {
    public int thirdMax(int[] n) {
        Set<Number> s = new HashSet<Number>();
        Arrays.sort(n);
        if(n.length == 1) return n[0];
        else if(n.length == 2) return n[1]; 
        else{
            for(int i = n.length-1; i >= 0; i--){
            s.add(n[i]);
            }
            List<Number> list = new ArrayList<Number>(s); // 0 -> +inf
            int t = list.size();
            if(t > 3) {
                return (int)list.get(t-3);
            }
            else if(t == 3) 
                return (int)list.get(0);
            else if(t == 2)
                return (int)list.get(1);
            else if(t == 1) 
                return (int)list.get(0);
            else return (int)list.get(t-3);
        }
    }
}
