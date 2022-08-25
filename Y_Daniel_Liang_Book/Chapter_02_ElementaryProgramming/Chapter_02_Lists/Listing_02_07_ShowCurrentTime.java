/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 25/8/2022
 * */

package Chapter_02_Lists;

public class Listing_02_07_ShowCurrentTime {
    public static void main(String[] args) {
        long totalTimeMillis, totalSeconds, currentSecond, totalMinutes, currentMinute, totalHours, currentHour;
        totalTimeMillis = System.currentTimeMillis();
        totalSeconds = totalTimeMillis / 1000;
        currentSecond = totalSeconds % 60;
        totalMinutes = totalSeconds / 60;
        currentMinute = totalMinutes % 60;
        totalHours = totalMinutes / 60;
        currentHour = totalHours % 24;
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
/*                                                 _Output_
 * Current time is 5:19:23 GMT
 * */