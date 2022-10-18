/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 18/10/2022
 * */

package Chapter_04_Examples;

public class Example_04_20 {
    public static void main(String[] args) {
        String intString = "123";
        int integerValue = Integer.parseInt(intString);
        System.out.println(intString + " + 1 = " + (integerValue + 1));
        String doubleString = "123.6";
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println(doubleString + " + 1 = " + (doubleValue + 1));
    }
}

//                                                 _Output_
/*
123 + 1 = 124
123.6 + 1 = 124.6
 */