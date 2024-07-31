/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 31/07/2024
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_13 {
    public static void main(String[] args) {
        int status;
        double income, tax = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("""
                0- single filer
                1- married jointly or qualifying widow(er)
                2- married separately,
                3- head of household
                """);
        System.out.print("Enter the filing status: ");
        status = input.nextInt();
        System.out.print("Enter the taxable income: ");
        income = input.nextDouble();
        switch (status) {
            case 0:
                tax = taxForSingle(income);
                break;
            case 1:
                tax = taxForMarriedJointly(income);
                break;
            case 2:
                tax = taxForMarriedSeparately(income);
                break;
            case 3:
                tax = taxForHousehold(income);
                break;
            default:
                System.out.print("Error: invalid status");
                System.exit(1);
        }
        System.out.printf("Tax is %.1f", tax);
    }

    public static double taxForSingle(final double income) {
        double tax = (income <= 8_350) ? income * 0.10 : 835;
        if (income > 8_350)
            tax += 0.15 * ((income < 33_950) ? income - 8_350 : 25_600);
        if (income > 33_950)
            tax += 0.25 * ((income < 82_250) ? income - 33_950 : 48_300);
        if (income > 82_250)
            tax += 0.28 * ((income < 171_550) ? income - 82_250 : 89_300);
        if (income > 171_550)
            tax += 0.33 * ((income < 372_950) ? income - 171_550 : 201_400);
        if (income > 372_950)
            tax += 0.35 * (income - 372_950);
        return tax;
    }

    public static double taxForMarriedJointly(final double income) {
        double tax = (income <= 16_700) ? income * 0.10 : 1670;
        if (income > 16_700)
            tax += 0.15 * ((income < 67_900) ? income - 16_700 : 51_200);
        if (income > 67_900)
            tax += 0.25 * ((income < 137_050) ? income - 67_900 : 69_150);
        if (income > 137_050)
            tax += 0.28 * ((income < 208_850) ? income - 137_050 : 71_800);
        if (income > 208_850)
            tax += 0.33 * ((income < 372_950) ? income - 208_850 : 164_100);
        if (income > 372_950)
            tax += 0.35 * (income - 372_950);
        return tax;
    }

    public static double taxForMarriedSeparately(final double income) {
        double tax = (income <= 8_350) ? income * 0.10 : 835;
        if (income > 8_350)
            tax += 0.15 * ((income < 33_950) ? income - 8_350 : 25_600);
        if (income > 33_950)
            tax += 0.25 * ((income < 68_525) ? income - 33_950 : 34_575);
        if (income > 68_525)
            tax += 0.28 * ((income < 104_425) ? income - 68_525 : 35_900);
        if (income > 104_425)
            tax += 0.33 * ((income < 186_475) ? income - 104_425 : 82_050);
        if (income > 186_475)
            tax += 0.35 * (income - 186_475);
        return tax;
    }

    public static double taxForHousehold(final double income) {
        double tax = (income <= 11_950) ? income * 0.10 : 1195;
        if (income > 11_950)
            tax += 0.15 * ((income < 45_500) ? income - 11_950 : 33_550);
        if (income > 45_500)
            tax += 0.25 * ((income < 117_450) ? income - 45_500 : 71_950);
        if (income > 117_450)
            tax += 0.28 * ((income < 190_200) ? income - 117_450 : 72_750);
        if (income > 190_200)
            tax += 0.33 * ((income < 372_950) ? income - 190_200 : 182_750);
        if (income > 372_950)
            tax += 0.35 * (income - 372_950);
        return tax;
    }
}

//                                                 _Output One_
/*
0- single filer
1- married jointly or qualifying widow(er)
2- married separately,
3- head of household
Enter the filing status: 0
Enter the taxable income: 400000
Tax is 117683.5
 */

//                                                 _Output Two_
/*
0- single filer
1- married jointly or qualifying widow(er)
2- married separately,
3- head of household
Enter the filing status: 1
Enter the taxable income: 400000
Tax is 110362.0
 */

//                                                 _Output Three_
/*
0- single filer
1- married jointly or qualifying widow(er)
2- married separately,
3- head of household
Enter the filing status: 2
Enter the taxable income: 400000
Tax is 125181.0
 */

//                                                 _Output Four_
/*
0- single filer
1- married jointly or qualifying widow(er)
2- married separately,
3- head of household
Enter the filing status: 3
Enter the taxable income: 400000
Tax is 114360.0
 */

//                                                 _Output Five_
/*
0- single filer
1- married jointly or qualifying widow(er)
2- married separately,
3- head of household
Enter the filing status: 4
Enter the taxable income: 400000
Error: invalid status
 */