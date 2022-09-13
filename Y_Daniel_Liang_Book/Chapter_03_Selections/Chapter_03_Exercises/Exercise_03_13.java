/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 13/9/2022
 * */

package Chapter_03_Exercises;

import java.util.Scanner;

//                                                 _Question_
                    /*(Financial application: compute taxes) Listing 3.5, ComputeTax.java, gives the
                    source code to compute taxes for single filers. Complete Listing 3.5 to compute
                    the taxes for all filing statuses.*/
//                                                 _Solution_
public class Exercise_03_13 {
    public static void main(String[] args) {
        double income, tax = 0.0;
        int status;
        boolean isIncomeInvalid, isStatusInvalid;
        Scanner input = new Scanner(System.in);
        System.out.println("0- single filer");
        System.out.println("1- married jointly or qualifying widow(er)");
        System.out.println("2- married separately");
        System.out.println("3- head of household");
        System.out.print("Enter the filing status: ");
        status = input.nextInt();
        System.out.print("Enter the taxable income: ");
        income = input.nextDouble();
        isIncomeInvalid = income < 0;
        isStatusInvalid = status > 3 || status < 0;
        if (isIncomeInvalid || isStatusInvalid) {
            if (isIncomeInvalid)
                System.out.println("Error: Wrong income.");
            if (isStatusInvalid)
                System.out.println("Error: Wrong status.");
            System.exit(0);
        }
        switch (status) {
            case 0: // Compute tax for single filers
                tax = (income <= 8_350) ? income * 0.1 : 8_350 * 0.1;
                if (income > 8_350)
                    tax += (income <= 33_950) ? (income - 8_350) * 0.15 : (33_950 - 8_350) * 0.15;
                if (income > 33_950)
                    tax += (income <= 82_250) ? (income - 33_950) * 0.25 : (82_250 - 33_950) * 0.25;
                if (income > 82_250)
                    tax += (income <= 171_550) ? (income - 82_250) * 0.28 : (171_550 - 82_250) * 0.28;
                if (income > 171_550)
                    tax += (income <= 372_950) ? (income - 171_550) * 0.33 : (372_950 - 171_550) * 0.33;
                if (income > 372_950)
                    tax += (income - 372_950) * 0.35;
                break;
            case 1: // Compute tax for married file jointly or qualifying widow(er)
                tax = (income <= 16_700) ? income * 0.1 : 16_700 * 0.1;
                if (income > 16_700)
                    tax += (income <= 67_900) ? (income - 16_700) * 0.15 : (67_900 - 16_700) * 0.15;
                if (income > 67_900)
                    tax += (income <= 137_050) ? (income - 67_900) * 0.25 : (137_050 - 67_900) * 0.25;
                if (income > 137_050)
                    tax += (income <= 208_850) ? (income - 137_050) * 0.28 : (208_850 - 137_050) * 0.28;
                if (income > 208_850)
                    tax += (income <= 372_950) ? (income - 208_850) * 0.33 : (372_950 - 208_850) * 0.33;
                if (income > 372_950)
                    tax += (income - 372_950) * 0.35;
                break;
            case 2: // Compute tax for married separately
                tax = (income <= 8_350) ? income * 0.1 : 8_350 * 0.1;
                if (income > 8_350)
                    tax += (income <= 33_950) ? (income - 8_350) * 0.15 : (33_950 - 8_350) * 0.15;
                if (income > 33_950)
                    tax += (income <= 68_525) ? (income - 33_950) * 0.25 : (68_525 - 33_950) * 0.25;
                if (income > 68_525)
                    tax += (income <= 104_425) ? (income - 68_525) * 0.28 : (104_425 - 68_525) * 0.28;
                if (income > 104_425)
                    tax += (income <= 186_475) ? (income - 104_425) * 0.33 : (186_475 - 104_425) * 0.33;
                if (income > 186_475)
                    tax += (income - 186_475) * 0.35;
                break;
            case 3: // Compute tax for head of household
                tax = (income <= 11_950) ? income * 0.1 : 11_950 * 0.1;
                if (income > 11_950)
                    tax += (income <= 45_500) ? (income - 11_950) * 0.15 : (45_500 - 11_950) * 0.15;
                if (income > 45_500)
                    tax += (income <= 117_450) ? (income - 45_500) * 0.25 : (117_450 - 45_500) * 0.25;
                if (income > 117_450)
                    tax += (income <= 190_200) ? (income - 117_450) * 0.28 : (190_200 - 117_450) * 0.28;
                if (income > 190_200)
                    tax += (income <= 372_950) ? (income - 190_200) * 0.33 : (372_950 - 190_200) * 0.33;
                if (income > 372_950)
                    tax += (income - 372_950) * 0.35;
                break;
        }
        System.out.println("Tax is " + (int) (tax * 100) / 100.0);
    }
}

/*                                                 _Output_
 * 0- single filer
 * 1- married jointly or qualifying widow(er)
 * 2- married separately
 * 3- head of household
 * Enter the filing status: 0
 * Enter the taxable income: 400000
 * Tax is 117683.5
 * */