/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 07/01/2024
 * */

package Chapter_01_Lists;

public class Listing_01_05_ShowRuntimeErrors {
    public static void main(String[] args) {
        System.out.println(1/0);
    }
}

//                                                 _Output_
/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Chapter_01_Lists.Listing_01_05_ShowRuntimeErrors.main(Listing_01_05_ShowRuntimeErrors.java:11)
 */