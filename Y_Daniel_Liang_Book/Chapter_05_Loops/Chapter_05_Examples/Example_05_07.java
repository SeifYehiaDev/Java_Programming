/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 22/12/2022
 * */

package Chapter_05_Examples;

public class Example_05_07 {
    public static void main(String[] args) {
        int index;
        for (index = 0; index < 10; index++) ; //  <=====
        System.out.println("index is " + index);
        for (index = 0; index < 10; index++) {
        }
        ; //  <=====
        System.out.println("index is " + index);
        int i = 0;
/*        while (i < 10);
        {
            System.out.println("i is " + i);
            i++;
        }*/
        System.out.println("Infinite loop");
/*        while (i < 10) { };
        {
            System.out.println("i is " + i);
            i++;
        }*/
        System.out.println("Infinite loop");
    }
}

//                                                 _Output_
/*
index is 10
index is 10
Infinite loop
Infinite loop
 */