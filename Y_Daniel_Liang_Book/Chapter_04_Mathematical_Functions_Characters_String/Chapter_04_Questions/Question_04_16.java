/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 18/10/2022
 * */

package Chapter_04_Questions;

//                                                 _Question_
                    /*Suppose that s1, s2, and s3 are three strings, given as follows:
                    String s1 = "Welcome to Java";
                    String s2 = "Programming is fun";
                    String s3 = "Welcome to Java";
                    What are the results of the following expressions?*/
//                                                 _Solution_
public class Question_04_16 {
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = "Programming is fun";
        String s3 = "Welcome to Java";
        System.out.println("s1 is \"".concat(s1).concat("\""));
        System.out.println("s2 is \"".concat(s2).concat("\""));
        System.out.println("s3 is \"".concat(s3).concat("\""));
        System.out.println("__________________________________________\n");
        System.out.println("(a) s1 == s2 is " + (s1 == s2)); // false
        System.out.println("(b) s2 == s3 is " + (s2 == s3)); // false
        System.out.println("(c) s1.equals(s2) is " + s1.equals(s2)); // false
        System.out.println("(d) s1.equals(s3) is " + s1.equals(s3)); // true
        System.out.println("(e) s1.compareTo(s2) is " + s1.compareTo(s2)); // 'W'-'P' = 7
        System.out.println("(f) s2.compareTo(s3) is " + s2.compareTo(s3)); // 'P'-'W' = -7
        System.out.println("(g) s2.compareTo(s2) is " + s2.compareTo(s2)); // 0
        System.out.println("(h) s1.charAt(0) is " + s1.charAt(0)); // 'W'
        System.out.println("(i) s1.indexOf('j') " + s1.indexOf('j')); // -1
        System.out.println("(j) s1.indexOf(\"to\") is " + s1.indexOf("to")); // 8
        System.out.println("(k) s1.lastIndexOf('a') is " + s1.lastIndexOf('a')); // 14
        System.out.println("(l) s1.lastIndexOf(\"o\", 15) is " + s1.lastIndexOf("o", 15)); // 9
        System.out.println("(m) s1.length() is " + s1.length());// 15
        System.out.println("(n) s1.substring(5) is \"".concat(s1.substring(5)).concat("\"")); // "me to Java"
        System.out.println("(o) s1.substring(5, 11) is \"".concat(s1.substring(5, 11)).concat("\"")); // "me to "
        System.out.println("(p) s1.startsWith(\"Wel\") is " + s1.startsWith("Wel")); // true
        System.out.println("(q) s1.endsWith(\"Java\") is " + s1.endsWith("Java")); // true
        System.out.println("(r) s1.toLowerCase() is \"".concat(s1.toLowerCase().concat("\""))); // "welcome to java"
        System.out.println("(s) s1.toUpperCase() is \"".concat(s1.toUpperCase()).concat("\"")); // "WELCOME TO JAVA"
        System.out.println("(t) s1.concat(s2) is \"" + s1.concat(s2).concat("\"")); // "Welcome to JavaProgramming is fun"
        System.out.println("(u) s1.contains(s2) is " + s1.contains(s2)); // false
        System.out.println("(v) \"\\t Wel \\t\".trim() is \"".concat("\t Wel \t".trim()).concat("\""));// " Wel "
    }
}

//                                                 _Output_
/*
s1 is "Welcome to Java"
s2 is "Programming is fun"
s3 is "Welcome to Java"
__________________________________________

(a) s1 == s2 is false
(b) s2 == s3 is false
(c) s1.equals(s2) is false
(d) s1.equals(s3) is true
(e) s1.compareTo(s2) is 7
(f) s2.compareTo(s3) is -7
(g) s2.compareTo(s2) is 0
(h) s1.charAt(0) is W
(i) s1.indexOf('j') -1
(j) s1.indexOf("to") is 8
(k) s1.lastIndexOf('a') is 14
(l) s1.lastIndexOf("o", 15) is 9
(m) s1.length() is 15
(n) s1.substring(5) is "me to Java"
(o) s1.substring(5, 11) is "me to "
(p) s1.startsWith("Wel") is true
(q) s1.endsWith("Java") is true
(r) s1.toLowerCase() is "welcome to java"
(s) s1.toUpperCase() is "WELCOME TO JAVA"
(t) s1.concat(s2) is "Welcome to JavaProgramming is fun"
(u) s1.contains(s2) is false
(v) "\t Wel \t".trim() is "Wel"
 */