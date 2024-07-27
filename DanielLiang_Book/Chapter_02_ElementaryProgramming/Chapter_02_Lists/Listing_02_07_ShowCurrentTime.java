/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 27/07/2024
 * */

package Chapter_02_Lists;

public class Listing_02_07_ShowCurrentTime {
    public static void main(String[] args) {
        long totalTimeMillis, totalSeconds, currentSecond, totalMinutes, currentMinutes, totalHours, currentHours;
        totalTimeMillis = System.currentTimeMillis();
        totalSeconds = totalTimeMillis / 1000;
        currentSecond = totalSeconds % 60;
        totalMinutes = totalSeconds / 60;
        currentMinutes = totalMinutes % 60;
        totalHours = totalMinutes / 60;
        currentHours = totalHours % 24;
        System.out.printf("Current time is %02d:%02d:%02d GMT", currentHours, currentMinutes, currentSecond);
    }
}

//                                                 _Output_
/*
Current time is 10:12:03 GMT
 */