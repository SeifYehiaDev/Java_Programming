/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 16/10/2022
 * */

package Chapter_04_Questions;

//                                                 _Question_
                                /*Evaluate the following method calls:*/
//                                                 _Solution_
public class Question_04_01 {
    public static void main(String[] args) {
        System.out.println("(a) Math.sqrt(4) = " + Math.sqrt(4)); // return 2.0
        System.out.println("(b) Math.sin(2 * Math.PI) = " + Math.sin(2 * Math.PI)); // return -2.4492935982947064E-16
        System.out.println("(c) Math.cos(2 * Math.PI) = " + Math.cos(2 * Math.PI)); // return 1.0
        System.out.println("(d) Math.pow(2, 2) = " + Math.pow(2, 2)); // return 4.0
        System.out.println("(e) Math.log(Math.E) = " + Math.log(Math.E)); // return 1.0
        System.out.println("(f) Math.exp(1) = " + Math.exp(1)); // return Math.E = 2.718281828459045
        System.out.println("(g) Math.max(2, Math.min(3, 4)) = " + Math.max(2, Math.min(3, 4))+" ===> int"); // return 3
        System.out.println("(h) Math.rint(-2.5) = " + Math.rint(-2.5)); // return -2.0
        System.out.println("(i) Math.ceil(-2.5) = " + Math.ceil(-2.5)); // return -2.0
        System.out.println("(j) Math.floor(-2.5) = " + Math.floor(-2.5)); // return -3.0
        System.out.println("(k) Math.round(-2.5f) = " + Math.round(-2.5f)+" ===> int"); // return -2 ===> int
        System.out.println("(l) Math.round(-2.5) = " + Math.round(-2.5)+" ===> long"); // return -2 ===> long
        System.out.println("(m) Math.rint(2.5) = " + Math.rint(2.5)); // return 2.0
        System.out.println("(n) Math.ceil(2.5) = " + Math.ceil(2.5)); // return 3.0
        System.out.println("(o) Math.floor(2.5) = " + Math.floor(2.5)); // return 2.0
        System.out.println("(p) Math.round(2.5f) = " + Math.round(2.5f)+" ===> int"); // return 3 ===> int
        System.out.println("(q) Math.round(2.5) = " + Math.round(2.5)+" ===> long"); // return 3 ===> long
        System.out.println("(r) Math.round(Math.abs(-2.5)) = " + Math.round(Math.abs(-2.5))+" ===> long"); // return 3 ===> long
    }
}

//                                                 _Output_
/*
(a) Math.sqrt(4) = 2.0
(b) Math.sin(2 * Math.PI) = -2.4492935982947064E-16
(c) Math.cos(2 * Math.PI) = 1.0
(d) Math.pow(2, 2) = 4.0
(e) Math.log(Math.E) = 1.0
(f) Math.exp(1) = 2.718281828459045
(g) Math.max(2, Math.min(3, 4)) = 3 ===> int
(h) Math.rint(-2.5) = -2.0
(i) Math.ceil(-2.5) = -2.0
(j) Math.floor(-2.5) = -3.0
(k) Math.round(-2.5f) = -2 ===> int
(l) Math.round(-2.5) = -2 ===> long
(m) Math.rint(2.5) = 2.0
(n) Math.ceil(2.5) = 3.0
(o) Math.floor(2.5) = 2.0
(p) Math.round(2.5f) = 3 ===> int
(q) Math.round(2.5) = 3 ===> long
(r) Math.round(Math.abs(-2.5)) = 3 ===> long
*/