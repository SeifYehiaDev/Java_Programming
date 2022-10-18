/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 18/10/2022
 * */

package Chapter_04_Questions;

//                                                 _Question_
/*Suppose that s1 and s2 are two strings. Which of the following statements or expressions are incorrect?*/
//                                                 _Solution_
public class Question_04_17 {
    public static void main(String[] args) {
        String s1 = "Seif", s2 = "Yehia";
        System.out.println("(1) String s = \"Welcome to Java\";");
        System.out.println("it's correct");
        System.out.println("_______________________________________________");
        System.out.println("(2) String s3 = s1 + s2;");
        System.out.println("it's correct");
        System.out.println("_______________________________________________");
        System.out.println("(3) String s3 = s1 - s2;");
        System.out.println("it's not correct");
        System.out.println("_______________________________________________");
        System.out.println("(4) s1 == s2;");
        System.out.println("it's correct");
        System.out.println("_______________________________________________");
        System.out.println("(5) s1 >= s2;");
        System.out.println("it's not correct");
        System.out.println("_______________________________________________");
        System.out.println("(6) s1.compareTo(s2);");
        System.out.println("it's correct");
        System.out.println("_______________________________________________");
        System.out.println("(7) int i = s1.length();");
        System.out.println("it's correct");
        System.out.println("_______________________________________________");
        System.out.println("(8) char c = s1(0);");
        System.out.println("it's not correct");
        System.out.println("_______________________________________________");
        System.out.println("(9) char c = s1.charAt(s1.length());");
        System.out.println("it's not correct ===> run time error (Exception)");
    }
}

//                                                 _Output_
/*
(1) String s = "Welcome to Java";
it's correct
_______________________________________________
(2) String s3 = s1 + s2;
it's correct
_______________________________________________
(3) String s3 = s1 - s2;
it's not correct
_______________________________________________
(4) s1 == s2;
it's correct
_______________________________________________
(5) s1 >= s2;
it's not correct
_______________________________________________
(6) s1.compareTo(s2);
it's correct
_______________________________________________
(7) int i = s1.length();
it's correct
_______________________________________________
(8) char c = s1(0);
it's not correct
_______________________________________________
(9) char c = s1.charAt(s1.length());
it's not correct ===> run time error (Exception)
 */