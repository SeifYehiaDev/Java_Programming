/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 16/9/2022
 * */

package Chapter_03_Exercises;

//                                                 _Question_
                    /*(Game: pick a card) Write a program that simulates picking a card from a deck
                    of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                    Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.*/
//                                                 _Solution_
public class Exercise_03_24 {
    public static void main(String[] args) {
        int rank, suit;
        String stringRank, stringSuit;
        rank = (int) (Math.random() * (14 - 1) + 1);
        suit = (int) (Math.random() * (5 - 1) + 1);
        stringRank = (rank == 1) ? "Ace" : (rank == 11) ? "Jack" : (rank == 12) ? "Queen" : (rank == 13) ? "King" : Integer.toString(rank);
        switch (suit) {
            case 1:
                stringSuit = "Clubs";
                break;
            case 2:
                stringSuit = "Diamonds";
                break;
            case 3:
                stringSuit = "Hearts";
                break;
            default:
                stringSuit = "Spades";
        }
        System.out.println("The card you picked is " + stringRank + " of " + stringSuit);
    }
}

/*                                                 _Output_
 * The card you picked is Queen of Hearts
 * */