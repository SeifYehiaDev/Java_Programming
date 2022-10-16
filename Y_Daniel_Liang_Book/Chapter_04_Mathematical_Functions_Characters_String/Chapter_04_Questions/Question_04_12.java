/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 16/10/2022
 * */

package Chapter_04_Questions;

//                                                 _Question_
        /*Can the following conversions involving casting be allowed? If so, find the converted
        result.*/
//                                                 _Solution_
public class Question_04_12 {
    public static void main(String[] args) {
        char c = 'A';
        int i = (int) c;
        System.out.println(i);
        System.out.println("_________________________");
        float f = 1000.34f;
        i = (int) f;
        System.out.println(i);
        System.out.println("_________________________");
        double d = 1000.34;
        i = (int) d;
        System.out.println(i);
        System.out.println("_________________________");
        i = 97;
        c = (char) i;
        System.out.println(c);
    }
}

//                                                 _Output_
/*
65
_________________________
1000
_________________________
1000
_________________________
a
 */