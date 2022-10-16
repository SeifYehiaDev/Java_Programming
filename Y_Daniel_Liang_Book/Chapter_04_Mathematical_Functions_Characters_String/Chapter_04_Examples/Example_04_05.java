/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 16/10/2022
 * */

package Chapter_04_Examples;

public class Example_04_05 {
    public static void main(String[] args) {
        // Generate random value between 0 and 1
        System.out.println("Generate random value between 0 and 1\n" + (int) (Math.random() * 2));
        // Generate random value between -1 and 1
        System.out.println("Generate random value between -1 and 1\n" + (((int) (Math.random() * 2) == 0) ? -1 : 1));
        // Generate random value between 50 and 100
        System.out.println("Generate random value between 50 and 100\n" + (int) (Math.random() * (100 - 50 + 1) + 50));
        // Generate random value between -100 and -10
        System.out.println("Generate random value between -100 and -10\n" + (int) (Math.random() * (-10 + 100 + 1) - 100));
    }
}

//                                                 _Output_
/**/