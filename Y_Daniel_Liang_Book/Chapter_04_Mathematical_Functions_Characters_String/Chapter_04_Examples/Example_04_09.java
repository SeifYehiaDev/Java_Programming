/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 16/10/2022
 * */

package Chapter_04_Examples;

public class Example_04_09 {
    public static void main(String[] args) {
        System.out.println("Uppercase letter start from " + (int) 'A' + " to " + (int) 'Z');
        System.out.println("Lowercase letter start from " + (int) 'a' + " to " + (int) 'z');
        System.out.println("Numeric character letter start from " + (int) '0' + " to " + (int) '9');
        System.out.println("_______________________________________________________________________");
        findCharacter(65);
        findCharacter(66);
        findCharacter(89);
        findCharacter(97);
        findCharacter(122);
        findCharacter(50);
        findCharacter(100);
    }

    public static void findCharacter(int uniCode) {
        if (uniCode >= 'a' && uniCode <= 'z')
            System.out.println(uniCode + " is \'" + (char) uniCode + "\'" + " a lowercase letter");
        else if (uniCode >= 'A' && uniCode <= 'Z')
            System.out.println(uniCode + " is \'" + (char) uniCode + "\'" + " an uppercase letter");
        else if (uniCode >= '0' && uniCode <= '9')
            System.out.println(uniCode + " is \'" + (char) uniCode + "\'" + " a numeric character");
        else
            System.out.println(uniCode + " is not letter or number");
    }
}

//                                                 _Output_
/*
Uppercase letter start from 65 to 90
Lowercase letter start from 97 to 122
Numeric character letter start from 48 to 57
_______________________________________________________________________
65 is 'A' an uppercase letter
66 is 'B' an uppercase letter
89 is 'Y' an uppercase letter
97 is 'a' a lowercase letter
122 is 'z' a lowercase letter
50 is '2' a numeric character
100 is 'd' a lowercase letter
 */