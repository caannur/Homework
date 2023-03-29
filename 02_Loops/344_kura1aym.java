class Solution {
    public void reverseString(char[] a) {
        int i = 0;
        int j = a.length - 1;
        char temp = ' ';
        while(i < j){
            temp = a[j];
            a[j] = a[i];
            a[i] = temp;
            i++;
            j--;
        }
    }
} 
