/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 09/01/2024
 * */

package Chapter_02_Lists;

public class Listing_02_07_ShowCurrentTime {
    public static void main(String[] args) {
        long totalSeconds = System.currentTimeMillis() / 1000, seconds, minutes, hours;
        seconds = totalSeconds % 60;
        minutes = (totalSeconds /= 60) % 60;
        hours = (totalSeconds /= 60) % 24;
        System.out.printf("Current time is %02d:%02d:%02d GMT", hours, minutes, seconds);
    }
}

//                                                 _Output_
/*
Current time is 03:02:01 GMT
 */