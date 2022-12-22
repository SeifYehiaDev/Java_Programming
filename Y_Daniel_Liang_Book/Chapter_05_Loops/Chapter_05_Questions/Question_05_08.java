/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 22/12/2022
 * */

package Chapter_05_Questions;

//                                                 _Question_
                            /*Do the following two loops result in the same value in sum?*/
//                                                 _Solution_
public class Question_05_08 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Loop (A)");
        for (int i = 0; i < 10; ++i)
            sum += i;
        System.out.println("The sum is " + sum);
        System.out.println("Loop (B)");
        sum = 0;
        for (int i = 0; i < 10; i++)
            sum += i;
        System.out.println("The sum is " + sum);
        System.out.println("\nloop (A) and loop (B) at the same result.");
    }
}

//                                                 _Output_
/*
Loop (A)
The sum is 45
Loop (B)
The sum is 45

loop (A) and loop (B) at the same result.
 */