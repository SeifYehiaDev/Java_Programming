/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 31/8/2022
 * */

package Chapter_03_Exercises;

//                                                 _Question_
                    /*(Random month) Write a program that randomly generates an integer between 1
                    and 12 and displays the English month name January, February, …, December for
                    the number 1, 2, …, 12, accordingly.*/
//                                                 _Solution_
public class Exercise_03_04 {
    public static void main(String[] args) {
        int randomMonth = (int) (Math.random() * (12 - 1) + 1);
        switch (randomMonth) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
        }
    }
}

/*                                                 _Output_
 * July
 * */