/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 14/01/2024
 * */

package Chapter_03_Questions;

public class Question_03_32_V1 {
    public static void main(String[] args) {
        int day = 6 ;
        System.out.print("""
                ■ Write a switch statement that displays Sunday, Monday, Tuesday, Wednesday,
                Thursday, Friday, Saturday, if day is 0, 1, 2, 3, 4, 5, 6, accordingly.
                
                day 6 is:
                """);
        switch (day){
            case 0 : System.out.print("Sunday");break;
            case 1 : System.out.print("Monday");break;
            case 2 : System.out.print("Tuesday");break;
            case 3 : System.out.print("Wednesday");break;
            case 4 : System.out.print("Thursday");break;
            case 5 : System.out.print("Friday");break;
            case 6 : System.out.print("Saturday");
        }
    }
}

//                                                 _Output_
/*
■ Write a switch statement that displays Sunday, Monday, Tuesday, Wednesday,
Thursday, Friday, Saturday, if day is 0, 1, 2, 3, 4, 5, 6, accordingly.

day 6 is:
Saturday
 */