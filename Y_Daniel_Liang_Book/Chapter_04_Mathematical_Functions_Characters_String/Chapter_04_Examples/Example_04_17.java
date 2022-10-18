/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 18/10/2022
 * */

package Chapter_04_Examples;

public class Example_04_17 {
    public static void main(String[] args) {
        String message = "Welcome to Python";
        System.out.println("Message is\" ".concat(message).concat("\""));
        /*
         * W e l c o m e   t o
         * 0 1 2 3 4 5 6 7 8 9 10
         * ^                    ^
         * |                    |
         * beginIndex           endIndex
         * returnString = message.substring(beginIndex, (endIndex + 1))
         * (beginIndex > endIndex), it would be a runtime error (Exception)
         * */
        String returnString = message.substring(0, (10 + 1)); // return "Welcome to "
        String newMessage = returnString.concat("Java");
        System.out.println("New message is \" ".concat(newMessage).concat("\""));
        // System.out.println(message.substring(3, 1)); =====> runtime error
    }
}

//                                                 _Output_
/*
Message is" Welcome to Python"
New message is " Welcome to Java"
 */