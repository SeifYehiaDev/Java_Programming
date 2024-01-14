/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 13/01/2024
 * */

package Chapter_03_Questions;

public class Question_03_08 {
    public static void main(String[] args) {
        System.out.print("■ Suppose x = 3 and y = 2; show the output, if any, of the following code.");
        testCode(3, 2);
        System.out.println("\n");
        System.out.println("■ What is the output if x = 3 and y = 4?");
        testCode(3, 4);
        System.out.println("■ What is the output if x = 2 and y = 2?");
        testCode(2, 2);
    }

    public static void testCode(int x, int y) {
        int z;
        if (x > 2) {
            if (y > 2) {
                z = x + y;
                System.out.println("z is " + z);
            }
        } else
            System.out.println("x is " + x);
    }
}

//                                                 _Output_
/*
■ Suppose x = 3 and y = 2; show the output, if any, of the following code.

■ What is the output if x = 3 and y = 4?
z is 7
■ What is the output if x = 2 and y = 2?
x is 2
 */