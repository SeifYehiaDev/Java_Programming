/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 19/10/2022
 * */

package Chapter_04_Questions;

//                                                 _Question_
            /*Let s1 be " Welcome " and s2 be " welcome ". Write the code for the following statements:*/
//                                                 _Solution_
public class Question_04_20 {
    public static void main(String[] args) {
        final String s1 = " Welcome ", s2 = " welcome ";
        System.out.println("s1 is \"".concat(s1).concat("\""));
        System.out.println("s2 is \"".concat(s2).concat("\""));
        System.out.println("*********************************");
        System.out.println("(a) Check whether s1 is equal to s2 and assign the result to a Boolean variable isEqual.");
        System.out.println("boolean isEqual = s1.equals(s2);");
        System.out.println("isEqual = " + s1.equals(s2));
        System.out.println("________________________________________________");
        System.out.println("(b) Check whether s1 is equal to s2, ignoring case, and assign the result to a Boolean variable isEqual.");
        System.out.println("boolean isEqual = s1.equalsIgnoreCase(s2);");
        System.out.println("isEqual = " + s1.equalsIgnoreCase(s2));
        System.out.println("________________________________________________");
        System.out.println("(c) Compare s1 with s2 and assign the result to an int variable x.");
        System.out.println("int x = s1.compareTo(s2);");
        System.out.println("x = " + s1.compareTo(s2));
        System.out.println("________________________________________________");
        System.out.println("(d) Compare s1 with s2, ignoring case, and assign the result to an int variable x.");
        System.out.println("int x = s1.compareToIgnoreCase(s2);");
        System.out.println("x = " + s1.compareToIgnoreCase(s2));
        System.out.println("________________________________________________");
        System.out.println("(e) Check whether s1 has the prefix AAA and assign the result to a Boolean variable b.");
        System.out.println("boolean b = s1.startsWith(\"AAA\")");
        System.out.println("b = " + s1.startsWith("AAA"));
        System.out.println("________________________________________________");
        System.out.println("(f) Check whether s1 has the suffix AAA and assign the result to a Boolean variable b.");
        System.out.println("boolean b = s1.endsWith(\"AAA\")");
        System.out.println("b = " + s1.endsWith("AAA"));
        System.out.println("________________________________________________");
        System.out.println("(g) Assign the length of s1 to an int variable x.");
        System.out.println("int x = s1.length();");
        System.out.println("x = " + s1.length());
        System.out.println("________________________________________________");
        System.out.println("(h) Assign the first character of s1 to a char variable x.");
        System.out.println("char x = s1.charAt(0);");
        System.out.println("x = '" + s1.charAt(0) + "'");
        System.out.println("________________________________________________");
        System.out.println("(i) Create a new string s3 that combines s1 with s2.");
        System.out.println("String s3 = s1.concat(s2);");
        System.out.println("s3 = \"" + s1.concat(s2).concat("\""));
        System.out.println("________________________________________________");
        System.out.println("(j) Create a substring of s1 starting from index 1.");
        System.out.println("String subString = s1.substring(1);");
        System.out.println("subString = \"".concat(s1.substring(1)).concat("\""));
        System.out.println("________________________________________________");
        System.out.println("(k) Create a substring of s1 from index 1 to index 4.");
        System.out.println("String subString = s1.substring(1, 4);");
        System.out.println("subString = \"".concat(s1.substring(1, 4)).concat("\""));
        System.out.println("________________________________________________");
        System.out.println("(l) Create a new string s3 that converts s1 to lowercase.");
        System.out.println("String s3 = s1.toLowerCase();");
        System.out.println("s3 = \"".concat(s1.toLowerCase()).concat("\""));
        System.out.println("________________________________________________");
        System.out.println("(m) Create a new string s3 that converts s1 to uppercase.");
        System.out.println("String s3 = s1.toUpperCase();");
        System.out.println("s3 = \"".concat(s1.toUpperCase()).concat("\""));
        System.out.println("________________________________________________");
        System.out.println("(n) Create a new string s3 that trims whitespace characters on both ends of s1.");
        System.out.println("String s3 = s1.trim();");
        System.out.println("s3 = \"".concat(s1.trim()).concat("\""));
        System.out.println("________________________________________________");
        System.out.println("(o) Assign the index of the first occurrence of the character e in s1 to an int variable x.");
        System.out.println("int x = s1.indexOf('e');");
        System.out.println("x = " + s1.indexOf('e'));
        System.out.println("________________________________________________");
        System.out.println("(p) Assign the index of the last occurrence of the string abc in s1 to an int variable x.");
        System.out.println("int x = s1.lastIndexOf(\"abc\");");
        System.out.println("x = " + s1.lastIndexOf("abc"));
    }
}

//                                                 _Output_
/*
s1 is " Welcome "
s2 is " welcome "
*********************************
(a) Check whether s1 is equal to s2 and assign the result to a Boolean variable isEqual.
boolean isEqual = s1.equals(s2);
isEqual = false
________________________________________________
(b) Check whether s1 is equal to s2, ignoring case, and assign the result to a Boolean variable isEqual.
boolean isEqual = s1.equalsIgnoreCase(s2);
isEqual = true
________________________________________________
(c) Compare s1 with s2 and assign the result to an int variable x.
int x = s1.compareTo(s2);
x = -32
________________________________________________
(d) Compare s1 with s2, ignoring case, and assign the result to an int variable x.
int x = s1.compareToIgnoreCase(s2);
x = 0
________________________________________________
(e) Check whether s1 has the prefix AAA and assign the result to a Boolean variable b.
boolean b = s1.startsWith("AAA")
b = false
________________________________________________
(f) Check whether s1 has the suffix AAA and assign the result to a Boolean variable b.
boolean b = s1.endsWith("AAA")
b = false
________________________________________________
(g) Assign the length of s1 to an int variable x.
int x = s1.length();
x = 9
________________________________________________
(h) Assign the first character of s1 to a char variable x.
char x = s1.charAt(0);
x = ' '
________________________________________________
(i) Create a new string s3 that combines s1 with s2.
String s3 = s1.concat(s2);
s3 = " Welcome  welcome "
________________________________________________
(j) Create a substring of s1 starting from index 1.
String subString = s1.substring(1);
subString = "Welcome "
________________________________________________
(k) Create a substring of s1 from index 1 to index 4.
String subString = s1.substring(1, 4);
subString = "Wel"
________________________________________________
(l) Create a new string s3 that converts s1 to lowercase.
String s3 = s1.toLowerCase();
s3 = " welcome "
________________________________________________
(m) Create a new string s3 that converts s1 to uppercase.
String s3 = s1.toUpperCase();
s3 = " WELCOME "
________________________________________________
(n) Create a new string s3 that trims whitespace characters on both ends of s1.
String s3 = s1.trim();
s3 = "Welcome"
________________________________________________
(o) Assign the index of the first occurrence of the character e in s1 to an int variable x.
int x = s1.indexOf('e');
x = 2
________________________________________________
(p) Assign the index of the last occurrence of the string abc in s1 to an int variable x.
int x = s1.lastIndexOf("abc");
x = -1
 */