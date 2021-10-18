package com.employeeWage;

public class EmpWageComputation implements ComputeEmpWage{

    //declared global variables
    public static final int IS_FUll_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private int noOfCompany = 0;
    private CompanyEmpWage[] companyWageArray; // Array Declaration for Multiple companies

    // Default constructor: EmpWageComputation class and array initialization
    public EmpWageComputation() {
            companyWageArray = new CompanyEmpWage[5];
    }

    // Add companyEmpWage method: add company and passing parameter list
	private void addComapanyEmpWage(String company, int empWagePerHr, int workingDayPerMonth, int maxHrsInMonth) {
        companyWageArray[noOfCompany] = new CompanyEmpWage(company, empWagePerHr, workingDayPerMonth, maxHrsInMonth);
        noOfCompany++;
		
	}

    //display array
    private void empWageCalculation() {
            for (int i = 0; i < noOfCompany; i++) {
                    companyWageArray[i].setTotalEmpWage(empWageCalculation(companyWageArray[i]));
                    System.out.println(companyWageArray[i]);
            }
    }

    //method: employee wage calculation
    public int empWageCalculation(CompanyEmpWage companyEmpWage){
        //variables initialization
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 1;

        //check total emp hour not more than 100 and total days not more than 20
        while (totalEmpHrs <= companyEmpWage.maxHrsInMonth &&
               totalWorkingDays <= companyEmpWage.workingDayPerMonth){

                //random number for employee check
                int emp_Check  = (int) Math.floor(Math.random() * 10) % 3 ;

                //switch case to select emp full time, part time or absent
                switch (emp_Check){
                    case IS_FUll_TIME:
                            System.out.println("Employee is present Full Time");
                            empHrs = 8;
                            break;

                    case IS_PART_TIME:
                            System.out.println("Employee is present Part Time");
                            empHrs = 4;
                            break;

                    default:
                            System.out.println("Employee is Absent");
                            empHrs = 0;
                    }

             //calculate total emp hours
             totalEmpHrs += empHrs;
             System.out.println("Day : "+ totalWorkingDays +" Emp Hrs : "+empHrs);

            //day increment by 1 every iteration
             totalWorkingDays++ ;
           }

        // calculate total emp wage
        return companyEmpWage.totalEmpWage = totalEmpHrs * companyEmpWage.empWagePerHr;
    }

    //main method
    public static void main(String[] args){

        System.out.println("Welcome to Employee Wage Computation");

        EmpWageComputation companyWageArray = new EmpWageComputation();
        companyWageArray.addComapanyEmpWage("D-Mart",20,3,10);
        companyWageArray.addComapanyEmpWage("Jio",25,2,10);
        companyWageArray.addComapanyEmpWage("Amazon",15,4,10);
        companyWageArray.empWageCalculation();


    }

}
