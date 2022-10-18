/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 18/10/2022
 * */

package Chapter_04_Examples;

public class Example_04_19 {
    public static void main(String[] args) {
        String fullName = "Seif Yehia", firstName, lastName;
        firstName = fullName.substring(0, fullName.indexOf(' '));
        lastName = fullName.substring(fullName.indexOf(' ') + 1);
        System.out.println("The full name is \"".concat(fullName).concat("\""));
        System.out.println("The first name is \"".concat(firstName).concat("\""));
        System.out.println("The last name is \"".concat(lastName).concat("\""));
    }
}

//                                                 _Output_
/*

 */