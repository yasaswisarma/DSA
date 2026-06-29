//Daily Question : 17/06/26
//3614.Process String with Special Operations II
//Approach:1.  create an array for storing the length of the string at each point
//         2.  traverse the string from left to right and calculate the length of the string at each point and store it in the array
//         3.  traverse the string from right to left and find the character at the kth position in the final string
//         4.  return the character at the kth position in the final string
//         5.  Time Complexity: O(n) as we are traversing the string twice
//         6.  Space Complexity: O(n) as we are creating an array to store the length of the string at each point


package Daily_Questions;
class Solution {
    public char processStr(String s, long k) {
             int n = s.length();
        long[] len = new long[n];

        long currLen = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                currLen++;
            } else if (ch == '*') {
                if (currLen > 0) currLen--;
            } else if (ch == '#') {
                currLen *= 2;
            } else if (ch == '%') {
              
            }

           
            currLen = Math.min(currLen, (long)1e15 + 1);

            len[i] = currLen;
        }

        if (k >= currLen) {
            return '.';
        }

    
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            long prevLen = (i == 0) ? 0 : len[i - 1];

            if (ch >= 'a' && ch <= 'z') {

                if (k == prevLen) {
                    return ch;
                }

            } else if (ch == '#') {

                if (prevLen > 0) {
                    k %= prevLen;
                }

            } else if (ch == '%') {

                if (prevLen > 0) {
                    k = prevLen - 1 - k;
                }

            } else if (ch == '*') {
             
            }
        }

        return '.';
    }
}