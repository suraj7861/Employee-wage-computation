package com.employeeWage;

import java.util.ArrayList;

public class EmpWageComputation implements ComputeEmpWage{

    //declared global variables
    public static final int IS_FUll_TIME = 1;
    public static final int IS_PART_TIME = 2;
 
    // ArrayList Declaration: Multiple companies 
    private ArrayList<CompanyEmpWage> companyWageArrayList; 
    //constructor
    public EmpWageComputation() {
	super();
	companyWageArrayList = new ArrayList<CompanyEmpWage>();
    }

    // Add companyEmpWage method
    public void addComapanyEmpWage(String company, int empWagePerHr, int workingDayPerMonth, int maxHrsInMonth) {
	CompanyEmpWage companyWage   = new CompanyEmpWage(company, empWagePerHr, workingDayPerMonth, maxHrsInMonth);
	companyWageArrayList.add(companyWage);
    }

    //display array
    public void empWageCalculation() {
        for (int i = 0; i < companyWageArrayList.size(); i++) {
            CompanyEmpWage companyWage = companyWageArrayList.get(i);//get index 
            companyWage.setTotalEmpWage(empWageCalculation(companyWage));//set Total emp wage
            System.out.println("Arraylist Element:"+companyWage);//print ArrayList
            System.out.println("--------------------------------------");    
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
	      
	    //Daily wage calculation
	    int dailyWage=empHrs * companyEmpWage.empWagePerHr;
	    System.out.println("Daily Employee Wage: "+dailyWage);

            //day increment by 1 every iteration
            totalWorkingDays++ ;
        }

        // calculate total emp wage
        return companyEmpWage.totalEmpWage = totalEmpHrs * companyEmpWage.empWagePerHr;
    }

    //main method
    public static void main(String[] args){

        System.out.println("Welcome to Employee Wage Computation");
        //create object
        EmpWageComputation companyWageArray = new EmpWageComputation();
        //Add parameters
        companyWageArray.addComapanyEmpWage("D-Mart",20,3,10);
        companyWageArray.addComapanyEmpWage("Jio",25,2,10);
        companyWageArray.addComapanyEmpWage("Amazon",15,4,10);
        companyWageArray.empWageCalculation();

    }

}

