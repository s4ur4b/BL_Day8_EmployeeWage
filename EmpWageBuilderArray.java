package com.BL.empWage;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpWageBuilderArray {

    public static final int partTime = 1;
    public static final int fullTime = 2;

    private ArrayList<EmpWage> empWageBuilder = new ArrayList<>();


    public void computeEmpWage(){
        for (int i = 0; i<empWageBuilder.size(); i++) {
           EmpWage empWage= empWageBuilder.get(i);
            empWage.setTotalEmpWage(computeEmpWage(empWage));
            System.out.println(empWage);
        }

    }


    public int computeEmpWage(EmpWage empWage) {

            // Variables
            int empHours, totalWorkingDays = 0, totalEmpHours = 0;
            // Computation

            while (totalEmpHours < empWage.maxHoursInMonth && totalWorkingDays < empWage.workingDays) {

                totalWorkingDays++;

                int empCheck = (int) Math.floor(Math.random() * 10 % 3);

                switch (empCheck) {
                    case partTime:
                        empHours = 4;
                        break;
                    case fullTime:
                        empHours = 8;
                        break;
                    default:
                        empHours = 0;
                }
                totalEmpHours += empHours;
                System.out.println("Day# : " + totalWorkingDays + " Emp Hrs: " + empHours + " Total Working Hours: " + totalEmpHours);

            }
        return totalEmpHours * empWage.empRatePerHour;
    }

    public static void main(String[] args) {
        EmpWageBuilderArray empWageBuilderArray = new EmpWageBuilderArray();
        EmpWage empData = new EmpWage("Reliance", 35, 20, 70);
        empWageBuilderArray.empWageBuilder.add(empData);

        EmpWage empData1 = new EmpWage("Dmart",40,22,80);
        empWageBuilderArray.empWageBuilder.add(empData1);

        EmpWage empData2 = new EmpWage("Tata",30,12,50);
        empWageBuilderArray.empWageBuilder.add(empData2);

        empWageBuilderArray.computeEmpWage();

        System.out.println("Enter name of the company for which you want the total employee wage");
        Scanner scan = new Scanner(System.in);
        String company = scan.nextLine();
        for (EmpWage item: empWageBuilderArray.empWageBuilder){
            if (item.company.equals(company)){
                System.out.println("Total employee wage : "+item.totalEmpWage);
            }
        }
    }
}
