/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 18/10/2022
 * */

package Chapter_04_Questions;

//                                                 _Question_
/**/
//                                                 _Solution_
public class Question_04_19 {
    public static void main(String[] args) {
        System.out.println(1 + "Welcome " + 1 + 1); // 1Welcome 11
        System.out.println(1 + "Welcome " + (1 + 1)); // 1Welcome 2
        System.out.println(1 + "Welcome " + ('\u0001' + 1));// 1Welcome 2
        System.out.println(1 + "Welcome " + ('a' + 1)); //1Welcome 98
        System.out.println(1 + "Welcome " + 'a' + 1); //1Welcome a1
    }
}

//                                                 _Output_
/*
1Welcome 11
1Welcome 2
1Welcome 2
1Welcome 98
1Welcome a1
 */