/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 16/10/2022
 * */

package Chapter_04_Questions;

//                                                 _Question_
                        /*
                        What is Math.log(Math.exp(5.5))?
                        What is Math.exp(Math.log(5.5))?
                        What is Math.asin(Math.sin(Math.PI / 6))?
                        What is Math.sin(Math.asin(Math.PI / 6))?
                        */
//                                                 _Solution_
public class Question_04_07 {
    public static void main(String[] args) {
        System.out.println("What is Math.log(Math.exp(5.5))?");
        System.out.println(Math.log(Math.exp(5.5)));
        System.out.println("What is Math.exp(Math.log(5.5))?");
        System.out.println(Math.exp(Math.log(5.5)));
        System.out.println("What is Math.asin(Math.sin(Math.PI / 6))?");
        System.out.println(Math.asin(Math.sin(Math.PI / 6)));
        System.out.println("What is Math.sin(Math.asin(Math.PI / 6))?");
        System.out.println(Math.sin(Math.asin(Math.PI / 6)));
    }
}

//                                                 _Output_
/*
What is Math.log(Math.exp(5.5))?
5.5
What is Math.exp(Math.log(5.5))?
5.5
What is Math.asin(Math.sin(Math.PI / 6))?
0.5235987755982988
What is Math.sin(Math.asin(Math.PI / 6))?
0.5235987755982988
 */