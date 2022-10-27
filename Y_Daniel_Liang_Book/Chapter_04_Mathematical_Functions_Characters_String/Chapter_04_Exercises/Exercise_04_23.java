/*
 * Author : Seif Yehia Esmail Abdel-Aal
 * My accounts on social media (facebook , linkedin , instagram , github) : SeifYehiaDev
 * Created on : 27/10/2022
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

//                                                 _Question_
                    /*(Financial application: payroll) Write a program that reads the following information
                    and prints a payroll statement:
                    Employee’s name (e.g., Smith)
                    Number of hours worked in a week (e.g., 10)
                    Hourly pay rate (e.g., 9.75)
                    Federal tax withholding rate (e.g., 20%)
                    State tax withholding rate (e.g., 9%)*/
//                                                 _Solution_
public class Exercise_04_23 {
    public static void main(String[] args) {
        String name;
        double hoursWorked, hourlyPayRate, federalTaxRate, stateTaxRate, grossPay, federal, state, totalDeduction, pay;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        hourlyPayRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        federalTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        stateTaxRate = input.nextDouble();
        grossPay = hoursWorked * hourlyPayRate;
        federal = grossPay * federalTaxRate;
        state = grossPay * stateTaxRate;
        totalDeduction = federal + state;
        pay = grossPay - totalDeduction;
        System.out.printf("\nEmployee Name: %s\nHours Worked: %.1f\nPay Rate: $%.2f\nGross Pay: $%.1f\nDeductions:\n  Federal Withholding (20.0%%): $%.1f\n  State Withholding (9.0%%): $%.2f\n  Total Deduction: $%.2f\nNet Pay: $%.2f",
                name, hoursWorked, hourlyPayRate, grossPay, federal, state, totalDeduction, pay);
    }
}

//                                                 _Output_
/*
Enter employee's name: Smith
Enter number of hours worked in a week: 10
Enter hourly pay rate: 9.75
Enter federal tax withholding rate: 0.20
Enter state tax withholding rate: 0.09

Employee Name: Smith
Hours Worked: 10.0
Pay Rate: $9.75
Gross Pay: $97.5
Deductions:
  Federal Withholding (20.0%): $19.5
  State Withholding (9.0%): $8.78
  Total Deduction: $28.28
Net Pay: $69.23
 */