package calculator;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class EmpWage {
    //Main Method
    public static void main(String[] args) {
           EmployeeWageMaxHours  object = new EmployeeWageMaxHours();
           Scanner sc = new Scanner(System.in);
        System.out.println("Enter Company name: ");
        String company = sc.nextLine();
        System.out.println("Enter Employee Rate per Hour");
        int empRatePerHour = sc.nextInt();
        System.out.println("Enter maximum number of working Days for the Worker");
        int workingDays = sc.nextInt();
        System.out.println("Enter maximum number of working Hours for the Worker");
        int maxHoursInMonth = sc.nextInt();
            //Passing the User Input parameters into to function
            object.selectionMax(company,empRatePerHour,workingDays,maxHoursInMonth);
    }
}
//Created to Class for Employee Wage Computation
class EmployeeWageMaxHours {
    public static final int partTime=1, fullTime=2;

    void selectionMax(String company,int empRatePerHour, int workingDays, int maxHoursInMonth){

        int empHours, totalWorkingDays = 0, totalEmpHours = 0;

        while(totalEmpHours<maxHoursInMonth && totalWorkingDays<workingDays){
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random()*10%3);

            switch (empCheck){
                case partTime:
                    empHours=4;
                    break;
                case fullTime:;
                    empHours=8;
                    break;
                default:
                    empHours=0;
            }

            totalEmpHours += empHours;

        }
        System.out.println("For the company" +company+"\nTotal working Days"+totalWorkingDays+"\nTotal working Hours"+totalEmpHours);
        int totalEmpWage = empRatePerHour * totalEmpHours;
        System.out.println("Total Employee Wage: "+totalEmpWage+" Rs/-");
    }
}