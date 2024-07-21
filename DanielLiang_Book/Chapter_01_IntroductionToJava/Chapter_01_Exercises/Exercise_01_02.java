/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 21/07/2024
 * */

package Chapter_01_Exercises;

public class Exercise_01_02 {
    public static void main(String[] args) {
        System.out.println("DisplayThreeMessage V1");
        displayThreeMessages_V1();
        System.out.println("\n_______________________________________");
        System.out.println("DisplayThreeMessage V2");
        displayThreeMessages_V2();
        System.out.println("\n_______________________________________");
        System.out.println("DisplayThreeMessage V3");
        displayThreeMessages_V3();
    }

    public static void displayThreeMessages_V1() {
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.print("Welcome to Java");
    }

    public static void displayThreeMessages_V2() {
        System.out.print("""
                Welcome to Java
                Welcome to Java
                Welcome to Java
                Welcome to Java
                Welcome to Java""");
    }

    public static void displayThreeMessages_V3() {
        for (int index = 1; index <= 5; index++)
            System.out.println("Welcome to Java");
    }
}

//                                                 _Output_
/*
DisplayThreeMessage V1
Welcome to Java
Welcome to Java
Welcome to Java
Welcome to Java
Welcome to Java
_______________________________________
DisplayThreeMessage V2
Welcome to Java
Welcome to Java
Welcome to Java
Welcome to Java
Welcome to Java
_______________________________________
DisplayThreeMessage V3
Welcome to Java
Welcome to Java
Welcome to Java
Welcome to Java
Welcome to Java
 */