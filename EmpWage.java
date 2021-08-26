package calculator;


public class EmpWage {

    public final String company;
    public final int empRatePerHour;
    public final int workingDays;
    public final int maxHoursInMonth;
    public int totalEmpWage;

    public EmpWage(String company, int empRatePerHour, int workingDays, int maxHoursInMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.workingDays = workingDays;
        this.maxHoursInMonth = maxHoursInMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "EmpWage{" +
                "company='" + company + '\'' +
                ", totalEmpWage=" + totalEmpWage +
                '}';
    }
}

class EmpWageBuilderArray {

    public static final int partTime = 1;
    public static final int fullTime = 2;

    private int noOfCompany = 0;

    private EmpWage[] empWageArray;

    public EmpWageBuilderArray() {
        empWageArray = new EmpWage[5];
    }

    private void addEmpWage(String company, int empRatePerHour, int workingDays, int maxHoursInMonth) {
        empWageArray[noOfCompany] = new EmpWage( company,  empRatePerHour, workingDays, maxHoursInMonth);
        noOfCompany++;
    }

    private void computeEmpWage() {

        for (int i = 0; i < noOfCompany; i++) {
            empWageArray[i].setTotalEmpWage(this.computeEmpWage(empWageArray[i]));
            System.out.println(empWageArray[i]);
        }
    }

    private int computeEmpWage(EmpWage empWage) {

        // Variables
        int empHours , totalWorkingDays = 0, totalEmpHours = 0;
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
            System.out.println("Day# : " +totalWorkingDays+" Emp Hrs: "+empHours);

        }
        return totalEmpHours * empWage.empRatePerHour;
    }

    public static void main(String[] args) {
        EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
        empWageBuilder.addEmpWage("DMart",20,20,60);
        empWageBuilder.addEmpWage("Reliance",30,10,30);
        empWageBuilder.computeEmpWage();
    }

}
