/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 18/10/2022
 * */

package Chapter_04_Examples;

import java.util.Scanner;

public class Example_04_13 {
    public static void main(String[] args) {
        String stringOne, stringTwo, stringThree;
        Scanner input = new Scanner(System.in);
        System.out.println("________________ Example one ________________\n");
        System.out.print("Enter three words separated by spaces: ");
        stringOne = input.next();
        stringTwo = input.next();
        stringThree = input.next();
        System.out.println("String one is ".concat(stringOne));
        System.out.println("String two is ".concat(stringTwo));
        System.out.println("String three is ".concat(stringThree));
                /*To avoid input errors, do not use nextLine() after
                nextByte(), nextShort(), nextInt(), nextLong(), nextFloat(), nextDouble(), or next().
                The reasons will be explained in Section 12.11.4, ‘How Does Scanner Work?’*/
        input.nextLine(); // To prevent Error
        System.out.println("\n________________ Example two ________________\n");
        System.out.print("Enter a line: ");
        String oneLine = input.nextLine();
        System.out.println("The line entered is ".concat(oneLine));
    }
}

//                                                 _Output_
/*
________________ Example one ________________

Enter three words separated by spaces: Welcome to Java!
String one is Welcome
String two is to
String three is Java!

________________ Example two ________________

Enter a line: Welcome to Java!
The line entered is Welcome to Java!
 */