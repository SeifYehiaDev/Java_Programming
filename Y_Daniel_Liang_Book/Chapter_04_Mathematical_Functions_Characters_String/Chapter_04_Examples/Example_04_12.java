/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 18/10/2022
 * */

package Chapter_04_Examples;

import java.sql.SQLOutput;

public class Example_04_12 {
    public static void main(String[] args) {
        String message = "Welcome to Java";
        System.out.println("________________ Getting String Length ________________\n");
        System.out.println("The string message is \"Welcome to java\"");
        System.out.println("The length of " + message + " is " + message.length());
        System.out.println("At the same");
        System.out.println("the length of " + "Welcome to Java" + " is " + "Welcome to Java".length());
        System.out.println("The length of \"\" empty string is " + "".length());
        System.out.println("\n________________ Getting Characters from a String ________________\n");
        System.out.println("The string message is \"Welcome to java\"");
        char firstCharacterOfString = message.charAt(0); // return the first character of string
        System.out.println("The first character of string is '" + firstCharacterOfString + "'");
        char lastCharacterOfString = message.charAt(message.length() - 1); // return the last character of string
        System.out.println("The last character of string is '" + lastCharacterOfString + "'");
        System.out.println("\n________________ Concatenating Strings ________________\n");
        String fullName = "Seif";
        fullName += " Yehia";
        System.out.println("The full name is " + fullName);
        System.out.println("*********************************************");
        int i = 1, j = 2;
        message = "Welcome to Java and Java is fun ";
        System.out.println("what is the output of the following statement?");
        System.out.println(message + i + j);
        System.out.println(message + (i + j));
        System.out.println("*********************************************");
        String firstName = "Seif", lastName = "Yehia", fullNames;
        fullNames = firstName.concat(lastName);
        System.out.println("The full name is " + fullNames);
        System.out.println("\n________________ Converting Strings ________________\n");
        String lowerCaseMessage = "welcome";
        String upperCaseMessage = "WELCOME";
        System.out.println("lowerCaseMessage is " + lowerCaseMessage + " after to covert to upperCase is " + lowerCaseMessage.toUpperCase());
        System.out.println("upperCaseMessage is " + upperCaseMessage + " after to covert to lowercase is " + upperCaseMessage.toLowerCase());
        System.out.println("*********************************************");
        String newMessage = "\t Good Night \f";
        System.out.println("The new message is \"".concat(newMessage).concat("\""));
        System.out.println("The new message after using s.trim() is \"".concat(newMessage.trim()).concat("\""));
    }
}

//                                                 _Output_
/*
________________ Getting String Length ________________

The string message is "Welcome to java"
The length of Welcome to Java is 15
At the same
the length of Welcome to Java is 15
The length of "" empty string is 0

________________ Getting Characters from a String ________________

The string message is "Welcome to java"
The first character of string is 'W'
The last character of string is 'a'

________________ Concatenating Strings ________________

The full name is Seif Yehia
*********************************************
what is the output of the following statement?
Welcome to Java and Java is fun 12
Welcome to Java and Java is fun 3
*********************************************
The full name is SeifYehia

________________ Converting Strings ________________

lowerCaseMessage is welcome after to covert to upperCase is WELCOME
upperCaseMessage is WELCOME after to covert to lowercase is welcome
*********************************************
The new message is "	 Good Night "
The new message after using s.trim() is "Good Night"
 */