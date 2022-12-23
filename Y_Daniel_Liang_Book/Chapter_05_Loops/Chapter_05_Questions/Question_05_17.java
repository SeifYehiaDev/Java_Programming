/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 23/12/2022
 * */

package Chapter_05_Questions;

//                                                 _Question_
                            /*Identify and fix the errors in the following code*/
//                                                 _Solution_
public class Question_05_17 {
    public static void main(String[] args) {
/*        for (int i = 0; i < 10; i++);
        sum += i;
        if (i < j);
        System.out.println(i)
        else
        System.out.println(j);
        while (j < 10);
        {
            j++;
        }
        do{
            j++;
        }while (j < 10)*/
        int sum = 0, j = 5, i = 0;
        for (i = 0; i < 10; i++)
            sum += i;
        if (i < j)
            System.out.println(i);
        else
            System.out.println(j);
        while (j < 10)
            j++;
        do
            j++;
        while (j < 10);
    }
}

//                                                 _Output_
/*
 */