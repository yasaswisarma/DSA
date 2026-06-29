//Daily Question : 18/06/26
//1344. Angle Between Hands of a Clock
//Approach-1: 1.  formulae for angle between hour and minute hand is modulus|30*hour-5.5*minutes|
//            2.  if angle is greater than 180 then we need to subtract it from 360

//Approach-2: 1.  find angle made by hour hand with 12 o'clock => (30*hour + 0.5*minutes)*30 
//            2.  find angle made by minute hand with 12 o'clock => (6*minutes)*6
//            3.  find the difference between the two angles and if it is greater than 180 then we need to subtract it from 360

//            4.  return the angle
//         5.  Time Complexity: O(1) as we are performing constant time operations
//         6.  Space Complexity: O(1) as we are not using any




package Daily_Questions;

class Solution {
    public double DP_180626_1344(int hour, int minutes) {
        double angle = 0;
        if((hour>=1)&&(hour<=12)&&(minutes>=0)&&(minutes<=59)){
             angle = Math.abs(30*hour-5.5*minutes);
             if(angle>180){
            angle=360-angle;
        }
        }
        
        return angle;
    }
}