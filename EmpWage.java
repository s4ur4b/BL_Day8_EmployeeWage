package com.BL.empWage;


public class EmpWage {

    public String company ;
    public int empRatePerHour;
    public int workingDays;
    public int maxHoursInMonth;
    public int totalEmpWage;
    public int totalEmpHours;

    public EmpWage(String company, int empRatePerHour, int workingDays, int maxHoursInMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.workingDays = workingDays;
        this.maxHoursInMonth = maxHoursInMonth;
    }

    public EmpWage() {
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

