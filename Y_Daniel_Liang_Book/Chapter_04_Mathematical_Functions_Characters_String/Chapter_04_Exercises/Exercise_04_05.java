/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 20/10/2022
 * */

package Chapter_04_Exercises;


import java.util.Scanner;

//                                                 _Question_
                    /*(Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in
                    which all sides are of the same length and all angles have the same degree (i.e., the
                    polygon is both equilateral and equiangular).*/
//                                                 _Solution_
public class Exercise_04_05 {
    public static void main(String[] args) {
        int numberOfSides;
        double lengthOfSide, areaOfRegularPolygon;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        numberOfSides = input.nextInt();
        if (numberOfSides == 0) {
            System.out.println("Error: number of sides should be grater than 0.");
            System.exit(1);
        }
        System.out.print("Enter the side: ");
        lengthOfSide = input.nextDouble();
        areaOfRegularPolygon = (numberOfSides * Math.pow(lengthOfSide, 2.0)) / (4 * Math.tan(Math.PI / numberOfSides));
        System.out.println("The area of the polygon is " + areaOfRegularPolygon);
    }
}

//                                                 _Output One_
/*
Enter the number of sides: 5
Enter the side: 6.5
The area of the polygon is 72.69017017488385
 */

//                                                 _Output Two_
/*
Enter the number of sides: 0
Error: number of sides should be grater than 0.
 */