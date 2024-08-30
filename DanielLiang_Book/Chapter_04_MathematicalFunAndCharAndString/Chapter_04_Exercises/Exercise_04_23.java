/*
 * Author : Seif Yehia Esmail AbdelAal
 * My accounts on social media (FACEBOOK , LINKEDIN , INSTAGRAM , GITHUB) : SeifYehiaDev
 * Created on : 30/08/2024
 * */

package Chapter_04_Exercises;

import java.util.Scanner;

public class Exercise_04_23 {
    public static void main(String[] args) {
        String employeeName;
        double hoursWorked, hourlyPayRate, federalTaxRate, stateTaxRate, grossPay, federal, state, totalDeduction;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        employeeName = input.nextLine().trim();
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
        System.out.printf("""
                
                Employee name: %s
                Hours Worked: %.1f
                Pay Rate: $%.2f
                Gross Pay: $%.1f
                Deductions:
                  Federal Withholding (20.0%%): $%.2f
                  State Withholding (9.0%%): $%.2f
                  Total Deduction:$ %.2f
                Net Pay: $%.2f""",
                employeeName, hoursWorked, hourlyPayRate, grossPay, federal, state, totalDeduction, grossPay - totalDeduction);
    }
}

//                                                 _Output_
/*
Enter employee's name: Seif Yehia
Enter number of hours worked in a week: 10
Enter hourly pay rate: 9.75
Enter federal tax withholding rate: 0.20
Enter state tax withholding rate: 0.09

Employee name: Seif Yehia
Hours Worked: 10.0
Pay Rate: $9.75
Gross Pay: $97.5
Deductions:
  Federal Withholding (20.0%): $19.50
  State Withholding (9.0%): $8.78
  Total Deduction:$ 28.28
Net Pay: $69.23
 */