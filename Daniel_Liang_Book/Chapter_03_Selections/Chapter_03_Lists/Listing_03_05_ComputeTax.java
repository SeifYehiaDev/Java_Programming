/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 14/01/2024
 * */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_05_ComputeTax {
    public static void main(String[] args) {
        int status;
        double income, tax = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("""
                0- single filer
                1- married jointly or qualifying widow(er)
                2- married separately
                3- head of household
                """);
        System.out.print("Enter the filing status: ");
        status = input.nextInt();
        System.out.print("Enter the taxable income: ");
        income = input.nextInt();
        switch (status) {
            case 0: tax = taxForSingle(income);break;
            case 1: tax = taxForMarriedJointly(income);break;
            case 2: tax = taxForMarriedSeparately(income);break;
            case 3: tax = taxForHeadOfHouseHold(income);break;
            default:
                System.out.println("Error: invalid status");
                System.exit(1);
        }
        System.out.printf("Tax is %.1f", tax);
    }

    public static double taxForSingle(double income) {
        double tax = ((income <= 8_350) ? income : 8_350) * 0.10;
        if (income > 8_350)
            tax += (((income <= 33_950) ? income : 33_950) - 8_350) * 0.15;
        if (income > 33_950)
            tax += (((income <= 82_250) ? income : 82_250) - 33_950) * 0.25;
        if (income > 82_250)
            tax += (((income <= 171_550) ? income : 171_550) - 82_250) * 0.28;
        if (income > 171_550)
            tax += (((income <= 372_950) ? income : 372_950) - 171_550) * 0.33;
        if (income > 372_950)
            tax += (income - 372_950) * 0.35;
        return tax;
    }

    public static double taxForMarriedJointly(double income) {
        double tax = ((income <= 16_700) ? income : 16_700) * 0.10;
        if (income > 16_700)
            tax += (((income <= 67_900) ? income : 67_900) - 16_700) * 0.15;
        if (income > 67_900)
            tax += (((income <= 137_050) ? income : 137_050) - 67_900) * 0.25;
        if (income > 137_050)
            tax += (((income <= 208_850) ? income : 208_850) - 137_050) * 0.28;
        if (income > 208_850)
            tax += (((income <= 372_950) ? income : 372_950) - 208_850) * 0.33;
        if (income > 372_950)
            tax += (income - 372_950) * 0.35;
        return tax;
    }

    public static double taxForMarriedSeparately(double income) {
        double tax = ((income <= 8_350) ? income : 8_350) * 0.10;
        if (income > 8_350)
            tax += (((income <= 33_950) ? income : 33_950) - 8_350) * 0.15;
        if (income > 33_950)
            tax += (((income <= 68_525) ? income : 68_525) - 33_950) * 0.25;
        if (income > 68_525)
            tax += (((income <= 104_425) ? income : 104_425) - 68_525) * 0.28;
        if (income > 104_425)
            tax += (((income <= 186_475) ? income : 186_475) - 104_425) * 0.33;
        if (income > 186_475)
            tax += (income - 186_475) * 0.35;
        return tax;
    }

    public static double taxForHeadOfHouseHold(double income) {
        double tax = ((income <= 11_950) ? income : 11_950) * 0.10;
        if (income > 11_950)
            tax += (((income <= 45_500) ? income : 45_500) - 11_950) * 0.15;
        if (income > 45_500)
            tax += (((income <= 117_450) ? income : 117_450) - 45_500) * 0.25;
        if (income > 117_450)
            tax += (((income <= 190_200) ? income : 190_200) - 117_450) * 0.28;
        if (income > 190_200)
            tax += (((income <= 372_950) ? income : 372_950) - 190_200) * 0.33;
        if (income > 372_950)
            tax += (income - 372_950) * 0.35;
        return tax;
    }
}

//                                                 _Output_
/*
0- single filer
1- married jointly or qualifying widow(er)
2- married separately
3- head of household
Enter the filing status: 0
Enter the taxable income: 400000
Tax is 117683.5
 */