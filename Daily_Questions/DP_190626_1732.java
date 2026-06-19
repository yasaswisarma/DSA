//Daily Question : 19/06/26
//1732. Find the Highest Altitude
//Approach:1.  create an array for storing the altitude at each point
//         2.  find the maximum value in that array
//         3.  given an array gain where gain[i] is the net gain in altitude between points i and i + 1
//         4.  that is, gain[i] = altitude[i + 1] - altitude[i]

package Daily_Questions;

import java.util.Arrays;

public class DP_190626_1732 {
    class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] altitude = new int[n+1];
        altitude[0]=0;
        for(int i=0;i<n;i++){
            altitude[i+1]=gain[i]+altitude[i];
        }
        int max=Arrays.stream(altitude).max().getAsInt();
        return max;
    }
}
}
