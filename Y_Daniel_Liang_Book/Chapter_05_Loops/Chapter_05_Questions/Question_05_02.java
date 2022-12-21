/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 21/12/2022
 * */

package Chapter_05_Questions;

//                                                 _Question_
/*What is wrong if guess is initialized to 0 in line 20 in Listing 5.3?*/
//                                                 _Solution_
public class Question_05_02 {
    public static void main(String[] args) {
/*        int number = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.println(number);
        System.out.println("Guess a magic number between 0 and 100");
        int guess = 0;
        while (guess != number) {
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();
            if (guess == number)
                System.out.println("Yes, the number is " + number);
            else if (guess > number)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
        }*/
        System.out.println("if random number is equal 0 doesn't enter into while loop");
    }
}

//                                                 _Output_
/*
if random number is equal 0 doesn't enter into while loop
 */