package calculator;

import java.util.concurrent.ThreadLocalRandom;

public class EmpWage {
    public static void main(String[] args) {
        attendance object = new attendance();
        object.selection();

    }
}
class attendance{
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