package calculator;

import java.util.concurrent.ThreadLocalRandom;

public class EmpWage {
    public static void main(String[] args) {
            DailyWage object = new DailyWage();
            object.selection();
    }
}
class Attendance{
        int empPresent=0;
        int empAbsent=1;
        void selection() {
            int check = (int) ThreadLocalRandom.current().nextInt(0, 2);
            System.out.println(check);
            if (check == empPresent) {

                System.out.println("Employee is Present");

            } else {
                System.out.println("Employee is Absent");

            }
        }
}

class DailyWage{
    private int empFullTime=0;
    private int wagePerHour=20;
    private int workingHour=0;
    private int wage=0;
    private int monthlyWage=0;
    private int monthDays=20;
    void selection() {
        int check = (int) ThreadLocalRandom.current().nextInt(0, 2);
        System.out.println(check);
        switch (check){
            case 0:     workingHour=8;
            System.out.println("Employee is Full-time");
            wage=wagePerHour*workingHour;
            System.out.println("Daily wage of Employee: "+wage);
            monthlyWage=wage*monthDays;
                System.out.println("Monthly wage of Employee: "+monthlyWage);
            break;

            case 1:
            workingHour=4;
            System.out.println("Employee is Part-time");
            wage=wagePerHour*workingHour;
            System.out.println("Daily wage of Employee: "+wage+" Rs ");
                monthlyWage=wage*monthDays;
                System.out.println("Monthly wage of Employee: "+monthlyWage);
            break;
        }
    }
}