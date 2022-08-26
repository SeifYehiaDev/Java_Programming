/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 26/8/2022
 * */

package Chapter_02_Examples;

public class Example_02_07 {
    public static void main(String[] args) {
        System.out.println("_______________ The postfix(x++) example _______________");
        int i = 10, newNum;
        newNum = 10 * i++;
        System.out.println("i is " + i + ", newNum is " + newNum);
        System.out.println("**************** The same effect as ****************");
        i = 10;
        newNum = 10 * i;
        i = i + 1;
        System.out.println("i is " + i + ", newNum is " + newNum);
        System.out.println("\n_______________ The (++x)prefix example _______________");
        i = 10;
        newNum = 10 * ++i;
        System.out.println("i is " + i + ", newNum is " + newNum);
        System.out.println("**************** The same effect as ****************");
        i = 10;
        i = i + 1;
        newNum = 10 * i;
        System.out.println("i is " + i + ", newNum is " + newNum);
    }
}

/*                                                 _Output_
 * _______________ The postfix(x++) example _______________
 * i is 11, newNum is 100
 * **************** The same effect as ****************
 * i is 11, newNum is 100
 *
 * _______________ The (++x)prefix example _______________
 * i is 11, newNum is 110
 * **************** The same effect as ****************
 * i is 11, newNum is 110
 * */