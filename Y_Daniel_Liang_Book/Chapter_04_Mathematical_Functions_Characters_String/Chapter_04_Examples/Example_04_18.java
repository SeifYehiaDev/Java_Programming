/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 18/10/2022
 * */

package Chapter_04_Examples;

public class Example_04_18 {
    public static void main(String[] args) {
        String message = "Welcome to Java";
        /*
         * W e l c o m e   t o    J  a  v  a
         * 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
         * ^                                ^
         * |                                |
         * beginIndex                       endIndex
         * */
        System.out.println("__________________ indexOf('char') & indexOf('char',fromIndex) __________________\n");
        System.out.println("Message is \"".concat(message).concat("\""));
        System.out.println("message.indexOf('W') is " + message.indexOf('W'));
        System.out.println("message.indexOf('S') is " + message.indexOf('S'));
        System.out.println("message.indexOf('o') is " + message.indexOf('o'));
        System.out.println("message.indexOf('o', 5) is " + message.indexOf('o', 5));
        System.out.println("\n__________________ indexOf(\"String\") & indexOf(\"String\",fromIndex) __________________\n");
        System.out.println("Message is \"".concat(message).concat("\""));
        System.out.println("message.indexOf(\"come\") is " + message.indexOf("come"));
        System.out.println("message.indexOf(\"Java\", 5) is " + message.indexOf("Java", 5));
        System.out.println("\n__________________ lastIndexOf('char') & lastIndexOf('char',fromIndex) __________________\n");
        System.out.println("Message is \"".concat(message).concat("\""));
        System.out.println("message.lastIndexOf('W') is " + message.lastIndexOf('W'));
        System.out.println("message.lastIndexOf('o') is " + message.lastIndexOf('o'));
        System.out.println("message.lastIndexOf('o', 5) is " + message.lastIndexOf('o', 5));
        System.out.println("\n__________________ lastIndexOf(\"String\") & lastIndexOf(\"String\",fromIndex) __________________\n");
        System.out.println("Message is \"".concat(message).concat("\""));
        System.out.println("message.lastIndexOf(\"come\") is " + message.lastIndexOf("come"));
        System.out.println("message.lastIndexOf(\"Java\", 5) is " + message.lastIndexOf("Java", 5));
        System.out.println("message.lastIndexOf(\"Java\") is " + message.lastIndexOf("Java"));
    }
}

//                                                 _Output_
/*
__________________ indexOf('char') & indexOf('char',fromIndex) __________________

Message is "Welcome to Java"
message.indexOf('W') is 0
message.indexOf('S') is -1
message.indexOf('o') is 4
message.indexOf('o', 5) is 9

__________________ indexOf("String") & indexOf("String",fromIndex) __________________

Message is "Welcome to Java"
message.indexOf("come") is 3
message.indexOf("Java", 5) is 11

__________________ lastIndexOf('char') & lastIndexOf('char',fromIndex) __________________

Message is "Welcome to Java"
message.lastIndexOf('W') is 0
message.lastIndexOf('o') is 9
message.lastIndexOf('o', 5) is 4

__________________ lastIndexOf("String") & lastIndexOf("String",fromIndex) __________________

Message is "Welcome to Java"
message.lastIndexOf("come") is 3
message.lastIndexOf("Java", 5) is -1
message.lastIndexOf("Java") is 11

 */