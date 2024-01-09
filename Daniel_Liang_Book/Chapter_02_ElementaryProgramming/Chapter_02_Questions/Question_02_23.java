/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 09/01/2024
 * */

package Chapter_02_Questions;

public class Question_02_23 {
    public static void main(String[] args) {
        System.out.print("""
                ■ How do you obtain the current second, minute, and hour?
                    long totalMills = System.currentTimeMillis() returns the milliseconds since Jan 1, 1970.
                    long totalSeconds = totalMills / 1000 returns the total seconds.
                    long totalMinutes = totalSeconds / 60 returns the total minutes.
                    totalSeconds % 60 returns the current second.
                    totalMinutes % 60 returns the current minute.
                    totalMinutes / 60 % 24 returns the current hour.""");
    }
}

//                                                 _Output_
/*
■ How do you obtain the current second, minute, and hour?
    long totalMills = System.currentTimeMillis() returns the milliseconds since Jan 1, 1970.
    long totalSeconds = totalMills / 1000 returns the total seconds.
    long totalMinutes = totalSeconds / 60 returns the total minutes.
    totalSeconds % 60 returns the current second.
    totalMinutes % 60 returns the current minute.
    totalMinutes / 60 % 24 returns the current hour.
 */