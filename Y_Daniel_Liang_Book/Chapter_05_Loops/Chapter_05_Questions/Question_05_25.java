/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/12/2022
 * */

package Chapter_05_Questions;

//                                                 _Question_
/**/
//                                                 _Solution_
public class Question_05_25 {
    public static void main(String[] args) {
        int sum = 0, i;
        for (i = 0; i < 4; i++) {
            if (i % 3 == 0) continue;
            sum += i;
        }
        System.out.println("The sum is " + sum);
        System.out.println("After Converted to While-loop");
        sum = 0;
        i = 0;
        while (i < 4) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            sum += i;
            i++;
        }
        System.out.println("The sum is " + sum);
    }
}

//                                                 _Output_
/*
The sum is 3
After Converted to While-loop
The sum is 3
 */