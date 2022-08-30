/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 30/8/2022
 * */

package Chapter_03_Questions;

/*                                                 _Question_
 * Write a Boolean expression that evaluates to true if age is greater than 13 and less than 18.
 * */
//                                                 _Solution_

public class Question_03_25 {
    public static void main(String[] args) {
        int age;
        boolean isAgeValid;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter your age: ");
        age = input.nextInt();
        isAgeValid = age >= 13 && age <= 18;
        if (isAgeValid)
            System.out.println("your age is " + age + ", valid rang");
        else
            System.out.println("your age is " + age + ", Invalid rang");
    }
}

/*                                                 _Output One_
 * Enter your age: 25
 * your age is 25, Invalid rang
 * */

/*                                                 _Output Two_
 * Enter your age: 18
 * your age is 18, valid rang
 * */