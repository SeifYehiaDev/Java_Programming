/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 19/10/2022
 * */

package Chapter_04_Questions;

//                                                 _Question_
                            /*What is wrong in the following statements?*/
//                                                 _Solution_
public class Question_04_23 {
    public static void main(String[] args) {
        System.out.println("(a) System.out.printf(\"%5d %d\", 1, 2, 3);");
        System.out.printf("\"%5d %d\"\n", 1, 2, 3); // "    1 2"
        System.out.println("_________________________________________________________");
        System.out.println("(b) System.out.printf(\"%5d %f\", 1);");
       // System.out.printf("\"%5d %f\"\n", 1);
        System.out.println("MissingFormatArgumentException");
        System.out.println("_________________________________________________________");
        System.out.println("(c) System.out.printf(\"%5d %f\", 1, 2);");
      //  System.out.printf("\"%5d %f\"\n", 1, 2);
        System.out.println("IllegalFormatConversionException");
    }
}

//                                                 _Output_
/*
(a) System.out.printf("%5d %d", 1, 2, 3);
"    1 2"
_________________________________________________________
(b) System.out.printf("%5d %f", 1);
MissingFormatArgumentException
_________________________________________________________
(c) System.out.printf("%5d %f", 1, 2);
IllegalFormatConversionException
 */