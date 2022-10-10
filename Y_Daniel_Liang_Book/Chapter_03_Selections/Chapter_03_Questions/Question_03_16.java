/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 29/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * a. How do you generate a random integer i such that 0 <= i < 20?
 * b. How do you generate a random integer i such that 10 <= i < 20?
 * c. How do you generate a random integer i such that 10 <= i < 50?
 * d. Write an expression that returns 0 or 1 randomly.
 * e. Write an expression that generate 6 digit
 * */
//                                                 _Solution_

public class Question_03_16 {
    public static void main(String[] args) {
        System.out.println("a. How do you generate a random integer i such that 0 <= i < 20?");
        System.out.println((int) (Math.random() * (20 - 0) + 0));
        System.out.println("b. How do you generate a random integer i such that 10 <= i < 20?");
        System.out.println((int) (Math.random() * (20 - 10) + 10));
        System.out.println("c. How do you generate a random integer i such that 10 <= i <= 50?");
        System.out.println((int) (Math.random() * (50 - 10 + 1) + 10));
        System.out.println("d. Write an expression that returns 0 or 1 randomly.");
        System.out.println((int) (Math.random() * 2));
    }
}

/*                                                 _Output_
 * a. How do you generate a random integer i such that 0 <= i < 20?
 * 17
 * b. How do you generate a random integer i such that 10 <= i < 20?
 * 11
 * c. How do you generate a random integer i such that 10 <= i <= 50?
 * 12
 * d. Write an expression that returns 0 or 1 randomly.
 * 1
 * */