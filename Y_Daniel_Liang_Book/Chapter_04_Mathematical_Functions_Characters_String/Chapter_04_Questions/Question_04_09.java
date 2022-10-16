/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 16/10/2022
 * */

package Chapter_04_Questions;

//                                                 _Question_
                    /*Which of the following are correct literals for characters?
                    '1', '\u345dE', '\u3fFa', '\b', '\t' */
//                                                 _Solution_
public class Question_04_09 {
    public static void main(String[] args) {
        System.out.println("'1'" + " is correct");
        System.out.println("'\\u345dE'" + " isn't correct");
        System.out.println("'\\u3fFa'" + " is correct");
        System.out.println("'\\b'" + " is correct");
        System.out.println("'\\t'" + " is correct");
        System.out.println("'\\r'" + " is correct");
        System.out.println("'\\f'" + " is correct");
        System.out.println("'\\n'" + " is correct");
        System.out.println("'\\\'" + "  is correct");
        System.out.println("'\\\"'" + " is correct");
        System.out.println("'\\x'" + " isn't correct");
    }
}

//                                                 _Output_
/*
'1' is correct
'\u345dE' isn't correct
'\u3fFa' is correct
'\b' is correct
'\t' is correct
'\r' is correct
'\f' is correct
'\n' is correct
'\'  is correct
'\"' is correct
'\x' isn't correct
 */