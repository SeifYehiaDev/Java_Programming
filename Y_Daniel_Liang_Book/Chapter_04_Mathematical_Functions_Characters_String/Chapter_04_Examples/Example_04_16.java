/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 18/10/2022
 * */

package Chapter_04_Examples;

public class Example_04_16 {
    public static void main(String[] args) {
        String firstString = "Welcome to Java", secondString = "Welcome to Java", thirdString = "Welcome to C++";
        System.out.println("________________ (1) s1.equals(s2) ________________\n");
        System.out.println("The first  string is \"".concat(firstString).concat("\""));
        System.out.println("The second string is \"".concat(secondString).concat("\""));
        System.out.println("The third  string is \"".concat(thirdString).concat("\""));
        System.out.println("\n******************************************************\n");
        System.out.println("firstString.equals(secondString) is " + firstString.equals(secondString)); // return true
        System.out.println("firstString.equals(thirdString)  is " + firstString.equals(thirdString)); // return false
        System.out.println("\n________________ (2) s2.compareTo(s2) ________________\n");
        firstString = "abc";
        secondString = "abc";
        thirdString = "abg";
        System.out.println("The first  string is \"".concat(firstString).concat("\""));
        System.out.println("The second string is \"".concat(secondString).concat("\""));
        System.out.println("The third  string is \"".concat(thirdString).concat("\""));
        System.out.println("\n******************************************************\n");
        System.out.println("firstString.compareTo(secondString) is " + firstString.compareTo(secondString)); // return 0 because they're equals.
        System.out.println("firstString.compareTo(thirdString)  is " + firstString.compareTo(thirdString)); // return any number without 0 because they're not equals.
        System.out.println("Why firstString.compareTo(thirdString) return " + firstString.compareTo(thirdString) + " ?");
        System.out.println("Because 'c' - 'g' = " + ('c' - 'g'));
        System.out.println("\n________________ (3) s1.equalsIgnoreCase(s2) ________________\n");
        firstString = "hello";
        secondString = "HELLO";
        thirdString = "hi";
        System.out.println("The first  string is \"".concat(firstString).concat("\""));
        System.out.println("The second string is \"".concat(secondString).concat("\""));
        System.out.println("The third  string is \"".concat(thirdString).concat("\""));
        System.out.println("\n******************************************************\n");
        System.out.println("firstString.equalsIgnoreCase(secondString) is " + firstString.equalsIgnoreCase(secondString));
        System.out.println("firstString.equalsIgnoreCase(thirdString)  is " + firstString.equalsIgnoreCase(thirdString));
        System.out.println("\n________________ (4) s1.compareToIgnoreCase(s2) ________________\n");
        firstString = "abc";
        secondString = "ABC";
        thirdString = "abg";
        System.out.println("The first  string is \"".concat(firstString).concat("\""));
        System.out.println("The second string is \"".concat(secondString).concat("\""));
        System.out.println("The third  string is \"".concat(thirdString).concat("\""));
        System.out.println("\n******************************************************\n");
        System.out.println("firstString.compareToIgnoreCase(secondString) is " + firstString.compareToIgnoreCase(secondString));
        System.out.println("firstString.compareToIgnoreCase(thirdString)  is " + firstString.compareToIgnoreCase(thirdString));
        System.out.println("\n________________ (5) s.startsWith(prefix) ________________\n");
        String message = "Welcome to Java";
        System.out.println("The String message is \"".concat(message).concat("\""));
        System.out.println("message.startsWith(\"We\") is " + message.startsWith("We"));
        System.out.println("message.startsWith(\"we\") is " + message.startsWith("we"));
        System.out.println("\n________________ (6) s.endsWith(suffix) ________________\n");
        System.out.println("The String message is \"".concat(message).concat("\""));
        System.out.println("message.endsWith(\"va\") is " + message.endsWith("va"));
        System.out.println("message.endsWith(\"Va\") is " + message.endsWith("Va"));
        System.out.println("\n________________ (7) s.contains(s1) ________________\n");
        System.out.println("The String message is \"".concat(message).concat("\""));
        System.out.println("message.contains(\"Java\") is " + message.contains("Java"));
        System.out.println("message.contains(\"C++\") is " + message.contains("C++"));
    }
}

//                                                 _Output_
/*
________________ (1) s1.equals(s2) ________________

The first  string is "Welcome to Java"
The second string is "Welcome to Java"
The third  string is "Welcome to C++"

******************************************************

firstString.equals(secondString) is true
firstString.equals(thirdString)  is false

________________ (2) s2.compareTo(s2) ________________

The first  string is "abc"
The second string is "abc"
The third  string is "abg"

******************************************************

firstString.compareTo(secondString) is 0
firstString.compareTo(thirdString)  is -4
Why firstString.compareTo(thirdString) return -4 ?
Because 'c' - 'g' = -4

________________ (3) s1.equalsIgnoreCase(s2) ________________

The first  string is "hello"
The second string is "HELLO"
The third  string is "hi"

******************************************************

firstString.equalsIgnoreCase(secondString) is true
firstString.equalsIgnoreCase(thirdString)  is false

________________ (4) s1.compareToIgnoreCase(s2) ________________

The first  string is "abc"
The second string is "ABC"
The third  string is "abg"

******************************************************

firstString.compareToIgnoreCase(secondString) is 0
firstString.compareToIgnoreCase(thirdString)  is -4

________________ (5) s.startsWith(prefix) ________________

The String message is "Welcome to Java"
message.startsWith("We") is true
message.startsWith("we") is false

________________ (6) s.endsWith(suffix) ________________

The String message is "Welcome to Java"
message.endsWith("va") is true
message.endsWith("Va") is false

________________ (7) s.contains(s1) ________________

The String message is "Welcome to Java"
message.contains("Java") is true
message.contains("C++") is false
 */