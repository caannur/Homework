class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList();
        for(int i = 0; i < n; i++){
            int s = i+1;
            if(s % 3 == 0 && s % 5 == 0){
                list.add("FizzBuzz");
            }
            else if(s % 3 == 0){
                list.add("Fizz");
            }
            else if(s % 5 == 0){
                list.add("Buzz");
            }
            else{
                list.add(Integer.toString(s));
            }
        }
        return list;
    }
}
