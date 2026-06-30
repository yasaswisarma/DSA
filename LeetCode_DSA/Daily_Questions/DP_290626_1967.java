//Daily Challenge 29/06/2026
//1967. Number of Strings That Appear as Substrings in Word
//Approach:1.  Initialize a count variable to 0
//         2.  Iterate through the patterns array
//         3.  For each pattern, check if it is a substring of the word using the contains() method
//         4.  If it is, increment the count variable
//         5.  Return the count variable as the number of strings that appear as substrings in the word
//         6.  Time Complexity: O(n*m) where n is the length of the patterns array and m is the length of the word
//         7.  Space Complexity: O(1) as we are using a constant amount of space




package Daily_Questions;
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for (int i=0;i<patterns.length;i++) {
            String pattern=patterns[i];
            if (word.contains(pattern)) {
                count++;
            }
        }

        return count;
    }
}