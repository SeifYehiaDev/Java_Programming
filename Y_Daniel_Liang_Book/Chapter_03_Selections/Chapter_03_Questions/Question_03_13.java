/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * Are the following statements correct? Which one is better?
 * */
//                                                 _Solution_

public class Question_03_13 {
    public static void main(String[] args) {
        int age = 52;
        /*
        * Are the following statements correct?
        * Yes they are correct
        * Which one is better?
        * b
        * */
        System.out.println("a");
        {
            if (age < 16)
                System.out.println
                        ("Cannot get a driver's license");
            if (age >= 16)
                System.out.println
                        ("Can get a driver's license");
        }
        System.out.println("b");
        {
            if (age < 16)
                System.out.println
                        ("Cannot get a driver's license");
            else
                System.out.println
                        ("Can get a driver's license");
        }
    }
}

/*                                                 _Output_
 * */