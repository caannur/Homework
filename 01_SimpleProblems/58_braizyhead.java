class Solution {
    public int lengthOfLastWord(String s) {
      // 1ms
      // String[] res = s.split(" ");
      // return res[res.length-1].length(); 


        // 2ms
      // int lastWordLen = 0;
      // int currentWordLen = 0;
      //   for (int i = 0; i < s.length(); i++) {
      //       if (s.charAt(i) == ' ') {
      //           currentWordLen = 0;
      //       } else {
      //           currentWordLen++;
      //           lastWordLen = currentWordLen;
      //       }
      //   }
      //   return lastWordLen;

      // 0ms
      // Hello World - 11 letters
      int index = s.length() - 1; // 11 - 1 = 10 last index of string
        boolean findWord = false;
        int right = s.length() - 1; //11 - 1 = 10
        // while 10 >= 0
        while (index >= 0) {
          // s.charAt(10) = 'd' is not equal to ' '
            if (s.charAt(index) == ' ') {
              // if findWord is true
                if (findWord) {
                  // return 10 - 10 = 0
                    return right - index;
                }
            } 
            // findWord is false
            else if (!findWord) {
              // right = 10
                right = index;
                findWord = true;
            }
            // 10-- = 9
            index--;
        } 
        return findWord ? right + 1 : 0;
    }
}
