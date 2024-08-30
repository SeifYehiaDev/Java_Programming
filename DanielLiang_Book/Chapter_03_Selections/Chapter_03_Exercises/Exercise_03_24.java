/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_03_Exercises;

public class Exercise_03_24 {
    public static void main(String[] args) {
        final String[] SUIT = {"Clubs", "Diamonds", "Hearts", "Spades"};
        int rank = (int) (1 + Math.random() * 13), suit = (int) (Math.random() * 4);
        System.out.printf("The card you picked is %s of %s", (rank == 1) ? "Ace" : (rank == 11) ? "Jack" : (rank == 12) ? "Queen" : (rank == 13) ? "King" : String.valueOf(rank), SUIT[suit]);
    }
}

//                                                 _Output One_
/*
The card you picked is Jack of Spades
 */

//                                                 _Output Two_
/*
The card you picked is Ace of Diamonds
 */