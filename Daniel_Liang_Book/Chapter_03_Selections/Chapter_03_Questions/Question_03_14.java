/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 14/01/2024
 * */

package Chapter_03_Questions;

public class Question_03_14 {
    public static void main(String[] args) {
        testCodeA(14);
        testCodeB(14);
        System.out.println("________________________________________");
        testCodeA(15);
        testCodeB(15);
        System.out.println("________________________________________");
        testCodeA(30);
        System.out.println("************");
        testCodeB(30);
    }

    public static void testCodeA(final int number) {
        if (number % 2 == 0)
            System.out.println(number + " is even");
        if (number % 5 == 0)
            System.out.println(number + " is multiple of 5");
    }

    public static void testCodeB(final int number) {
        if (number % 2 == 0)
            System.out.println(number + " is even");
        else if (number % 5 == 0)
            System.out.println(number + " is multiple of 5");
    }
}

//                                                 _Output_
/*
14 is even
14 is even
________________________________________
15 is multiple of 5
15 is multiple of 5
________________________________________
30 is even
30 is multiple of 5
************
30 is even
 */