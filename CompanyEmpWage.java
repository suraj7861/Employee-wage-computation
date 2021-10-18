package com.employeeWage;

public class CompanyEmpWage {
    //Variable Declaration
    public final String company;
    public final int empWagePerHr;
    public final int workingDayPerMonth;
    public final int maxHrsInMonth;
    public int totalEmpWage;

// parameterized constructor calling
    public CompanyEmpWage(String company, int empWagePerHr, int workingDayPerMonth, int maxHrsInMonth) {
            this.company = company;
            this.empWagePerHr = empWagePerHr;
            this.workingDayPerMonth = workingDayPerMonth;
            this.maxHrsInMonth = maxHrsInMonth;
    }

    // setter : set total Employee wage
    public void setTotalEmpWage(int totalEmpWage) {
            this.totalEmpWage = totalEmpWage;
    }

    // tostring method: display purpose
    public String toString() {
            return "[Total Emp Wage for: " + company + " is: " + totalEmpWage + "]";
    }
}

