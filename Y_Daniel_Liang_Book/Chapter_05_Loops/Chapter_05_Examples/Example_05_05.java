/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 22/12/2022
 * */

package Chapter_05_Examples;

public class Example_05_05 {
    public static void main(String[] args) {
        int index, count;
        for (index = 0; index < 10; index++)
            System.out.println(index + 1 + "- Welcome to Java!");
        System.out.println("_______________________________________");
        index = 0;
        for (; index < 10; System.out.println(index + 1 + "- Welcome to Java!"), index++) ;
        System.out.println("_______________________________________");
        for (index = 0, count = 1; index < 10; System.out.println(count + "- Welcome to Java!"), index++, count++);
    }
}

//                                                 _Output_
/*
1- Welcome to Java!
2- Welcome to Java!
3- Welcome to Java!
4- Welcome to Java!
5- Welcome to Java!
6- Welcome to Java!
7- Welcome to Java!
8- Welcome to Java!
9- Welcome to Java!
10- Welcome to Java!
_______________________________________
1- Welcome to Java!
2- Welcome to Java!
3- Welcome to Java!
4- Welcome to Java!
5- Welcome to Java!
6- Welcome to Java!
7- Welcome to Java!
8- Welcome to Java!
9- Welcome to Java!
10- Welcome to Java!
_______________________________________
1- Welcome to Java!
2- Welcome to Java!
3- Welcome to Java!
4- Welcome to Java!
5- Welcome to Java!
6- Welcome to Java!
7- Welcome to Java!
8- Welcome to Java!
9- Welcome to Java!
10- Welcome to Java!
 */