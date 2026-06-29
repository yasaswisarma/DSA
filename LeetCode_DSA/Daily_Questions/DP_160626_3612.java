//Daily Question : 16/06/26
//3612.Process String with Special Operations I
//Approach:1.  create a StringBuilder to store the result
//         2.  traverse the string from left to right and perform the operations on the StringBuilder as per the character encountered
//         3.  return the final string after performing all the operations
//         4.  Time Complexity: O(n) as we are traversing the string
//         5.  Space Complexity: O(n) as we are creating a StringBuilder to store the result
//         5.  Space Complexity: O(n) as we are creating a StringBuilder to store the result





package Daily_Questions;

class Solution {
    public String processStr(String s) {
         StringBuilder result = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);

        if (ch >= 'a' && ch <= 'z') {
            result.append(ch);
        }

        if (ch == '*') {
            if (result.length() > 0) {
                result.deleteCharAt(result.length() - 1);
            }
        }

        if (ch == '#') {
            result.append(result.toString());
        }

        if (ch == '%') {
            result.reverse();
        }
    }

    return result.toString();
    }
}