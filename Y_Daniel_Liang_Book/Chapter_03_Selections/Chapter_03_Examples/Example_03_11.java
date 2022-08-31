/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 31/8/2022
 * */

package Chapter_03_Examples;

public class Example_03_11 {
    public static void main(String[] args) {
        int x = 69, y = 89, z = 79, largestNumber;
        // Multi-way if-else statement
        System.out.println("Using multi-way if-else statement");
        if (x > y && x > z)
            largestNumber = x;
        else if (y > z && y > x)
            largestNumber = y;
        else
            largestNumber = z;
        System.out.println("largestNumber = " + largestNumber);
        // Ternary Operator
        System.out.println("Using Ternary operator");
        largestNumber = (x > y && x > z) ? x : (y > z && y > x) ? y : z;
        System.out.println("largestNumber = " + largestNumber);
    }
}

/*                                                 _Output_
 * Using multi-way if-else statement
 * largestNumber = 89
 * Using Ternary operator
 * largestNumber = 89
 * */