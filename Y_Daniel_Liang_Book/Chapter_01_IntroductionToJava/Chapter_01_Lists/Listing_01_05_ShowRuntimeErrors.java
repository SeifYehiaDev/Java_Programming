/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 24/8/2022
 * */

package Chapter_01_Lists;

public class Listing_01_05_ShowRuntimeErrors {
    public static void main(String[] args) {
        System.out.println(1 / 0);
    }
}

/*                                                 _Output_
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 *     at Chapter_01_Lists.Listing_01_05_ShowRuntimeErrors.main(Listing_01_05_ShowRuntimeErrors.java:11)
 * */