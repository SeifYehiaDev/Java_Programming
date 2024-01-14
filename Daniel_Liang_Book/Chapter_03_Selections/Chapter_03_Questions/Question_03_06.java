/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 11/01/2024
 * */

package Chapter_03_Questions;

public class Question_03_06 {
    public static void main(String[] args) {
        System.out.print("""
                ■ Write an if statement that increases pay by 3% if score is greater than 90, otherwise increases pay by 1%.
                   if (score > 90)
                     pay *= 1.03;
                   else
                     pay *= 1.01;
                  /////////////////////////////////////////////
                   pay *= (score > 90) ? 1.03 : 1.01;""");
    }
}

//                                                 _Output_
/*
■ Write an if statement that increases pay by 3% if score is greater than 90, otherwise increases pay by 1%.
   if (score > 90)
     pay *= 1.03;
   else
     pay *= 1.01;
  /////////////////////////////////////////////
   pay *= (score > 90) ? 1.03 : 1.01;
 */