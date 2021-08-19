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
    int empFullTime=0;
    int wagePerHour=20;
    int workingHour=0;
    int wage=0;
    void selection() {
        int check = (int) ThreadLocalRandom.current().nextInt(0, 2);
        System.out.println(check);
        if (check == empFullTime) {
                workingHour=8;
            System.out.println("Employee is Full-time");
            wage=wagePerHour*workingHour;
            System.out.println("Daily wage of Employee: "+wage);


        } else {
            workingHour=4;
            System.out.println("Employee is Part-time");
            wage=wagePerHour*workingHour;
            System.out.println("Daily wage of Employee: "+wage+" Rs ");
        }
    }
}