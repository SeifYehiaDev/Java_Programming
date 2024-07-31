/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 31/07/2024
 * */

package Chapter_03_Exercises;

public class Exercise_03_16 {
    public static void main(String[] args) {
        int width = (int) (Math.random() * 101 - 50);
        int height = (int) (Math.random() * 201 - 100);
        System.out.printf("""
                Random coordinate in rectangle centered at (0,0)
                Width 100 and height 200: (%d, %d)""", width, height);
    }
}

//                                                 _Output_
/*
Random coordinate in rectangle centered at (0,0)
Width 100 and height 200: (-46, -78)
 */