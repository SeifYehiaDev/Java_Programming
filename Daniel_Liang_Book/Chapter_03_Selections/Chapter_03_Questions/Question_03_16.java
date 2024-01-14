/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 14/01/2024
 * */

package Chapter_03_Questions;

public class Question_03_16 {
    public static void main(String[] args) {
        System.out.println("■ How do you generate a random integer i such that 0 <= i < 20?");
        System.out.println((int) (Math.random() * 20));
        System.out.println("■ How do you generate a random integer i such that 10 <= i < 20?");
        System.out.println((int) (10 + Math.random() * (19 - 10 + 1)));
        System.out.println("■ How do you generate a random integer i such that 10 <= i <= 50?");
        System.out.println((int) (10 + Math.random() * (50 - 10 + 1)));
        System.out.println("■ Write an expression that returns 0 or 1 randomly.");
        System.out.print((int) (Math.random() * 2));
    }
}

//                                                 _Output_
/*
■ How do you generate a random integer i such that 0 <= i < 20?
19
■ How do you generate a random integer i such that 10 <= i < 20?
16
■ How do you generate a random integer i such that 10 <= i <= 50?
24
■ Write an expression that returns 0 or 1 randomly.
1
 */