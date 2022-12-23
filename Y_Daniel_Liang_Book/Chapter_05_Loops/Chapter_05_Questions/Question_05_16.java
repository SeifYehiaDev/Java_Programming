/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 23/12/2022
 * */

package Chapter_05_Questions;

//                                                 _Question_
/*Can you always convert a while loop into a for loop? Convert the following while loop into a for loop.*/
//                                                 _Solution_
public class Question_05_16 {
    public static void main(String[] args) {
        System.out.println("Can you always convert a while loop into a for loop?");
        System.out.println("Yes");
        System.out.println("\nConvert the following while loop into a for loop");
        int i = 1;
        int sum = 0;
        while (sum < 10000) {
            sum = sum + i;
            i++;
        }
        System.out.println("The sum is " + sum);
        System.out.println("After convert to for loop");
        sum = 0;
        for (i = 1; sum < 10000; sum += i, i++) ;
        System.out.println("The sum is " + sum);
    }
}

//                                                 _Output_
/*
Can you always convert a while loop into a for loop?
Yes

Convert the following while loop into a for loop
The sum is 10011
After convert to for loop
The sum is 10011
 */