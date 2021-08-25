package calculator;


//Created to Class for Employee Wage Computation
public class EmpWage {
    public static final int partTime = 1, fullTime = 2;

    private final String company;
    private final int empRatePerHour;
    private final int workingDays;
    private final int maxHoursInMonth;

    public EmpWage(String company, int empRatePerHour, int workingDays, int maxHoursInMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.workingDays = workingDays;
        this.maxHoursInMonth = maxHoursInMonth;
    }

    public void selectionMax() {

        int empHours , totalWorkingDays = 0, totalEmpHours = 0;

        while (totalEmpHours < maxHoursInMonth && totalWorkingDays < workingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10 % 3);

            switch (empCheck) {
                case partTime:
                    empHours = 4;
                    break;
                case fullTime:
                    ;
                    empHours = 8;
                    break;
                default:
                    empHours = 0;
            }

            totalEmpHours += empHours;

        }
        int totalEmpWage = empRatePerHour * totalEmpHours;
        System.out.println("Total Emp Wage is "+totalEmpWage);
    }

    @Override
    public String toString() {
        return "Company "+company;
    }

    public static void main(String[] args) {
        EmpWage reliance = new EmpWage("Reliance", 20, 20, 60);
        reliance.selectionMax();
        System.out.println(reliance);
        EmpWage dMart = new EmpWage("DMArt", 40, 20, 60);
        dMart.selectionMax();
        System.out.println(dMart);

    }

}
