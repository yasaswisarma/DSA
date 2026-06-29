//Daily Question : 28/06/26
//1846. Maximum Element After Decreasing and Rearranging
//Approach:1.  Sort the array in ascending order
//         2.  Set the first element to 1
//         3.  Iterate through the array and check if the difference between the current element and the previous element is greater than 1
//         4.  If it is, set the current element to the previous element + 1
//         5.  Return the last element of the array as the maximum element after decreasing and rearranging
//         6.  Time Complexity: O(nlogn) due to sorting
//         7.  Space Complexity: O(1) as we are modifying the array in place





package Daily_Questions;

import java.util.Arrays;

class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);       
        arr[0] = 1;       
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) > 1) {
                arr[i]=arr[i-1]+1;
            }
        }      
        return arr[arr.length-1];
    }
}