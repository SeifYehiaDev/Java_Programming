/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 21/12/2022
 * */

package Chapter_05_Questions;

//                                                 _Question_
                        /*What is the output of the following code? Explain the reason.*/
//                                                 _Solution_
public class Question_05_05 {
    public static void main(String[] args) {
        System.out.println("The range of integer data type from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        int Max_Value = 2_147_483_647;
        int x = 80_000_000;
        while (x > 0)
            x++;
        System.out.println("x is " + x);
        System.out.println("When x reach to 2_147_483_647 loop increment add 1 , out of range , x = Integer.MIN_VALUE , loop end");
    }
}

//                                                 _Output_
/*
The range of integer data type from -2147483648 to 2147483647
x is -2147483648
When x reach to 2_147_483_647 loop increment add 1 , out of range , x = Integer.MIN_VALUE , loop end
 */