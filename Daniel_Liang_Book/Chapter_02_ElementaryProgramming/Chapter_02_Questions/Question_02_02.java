/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 08/01/2024
 * */

package Chapter_02_Questions;

import java.util.Scanner;

public class Question_02_02 {
    public static void main(String[] args) {
        System.out.println("1- How do you write a statement to let the user enter a double value from the keyboard?");
        double radius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        radius = input.nextDouble();
        System.out.println("The radius of circle is " + radius);
        System.out.println("2- What happens if you entered 5a when executing the following code?");
        System.out.print("""
                Exception in thread "main" java.util.InputMismatchException
                	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
                	at java.base/java.util.Scanner.next(Scanner.java:1594)
                	at java.base/java.util.Scanner.nextDouble(Scanner.java:2564)
                	at Chapter_02_Questions.Question_02_02.main(Question_02_02.java:17)""");
    }
}

//                                                 _Output_
/*
1- How do you write a statement to let the user enter a double value from the keyboard?
Enter a number for radius: 50
The radius of circle is 50.0
2- What happens if you entered 5a when executing the following code?
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextDouble(Scanner.java:2564)
	at Chapter_02_Questions.Question_02_02.main(Question_02_02.java:17)
 */