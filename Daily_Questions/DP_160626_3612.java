//Daily Question : 16/06/26
//3612.Process String with Special Operations I
//Approach:1.  create a StringBuilder to store the result
//         2.  traverse the string from left to right and perform the operations on the StringBuilder as per the character encountered





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