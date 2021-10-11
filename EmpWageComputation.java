//package com.employeeWage;
public class EmpWageComputation{

       //declared global variables
       public static final int IS_FUll_TIME = 1;
       public static final int IS_PART_TIME = 2;
       public static final int EMP_WAGE_PER_HR = 20;
       public static final int NUM_WORKING_DAYS = 20;
       public static final int MAX_HRS_IN_MONTH = 100; 

       public static void main(String[] args){
	
            System.out.println("Welcome to Employee Wage Computation");

	    int empHrs = 0, totalEmpHrs = 0, TotalWorkingDays = 1;

	    //while loop for check Total emp hours is less than 100 and Total working days less than 20
	    while (totalEmpHrs <= Max_Hrs_In_Month && 
                    TotalWorkingDays <= Num_Working_Days){

                    TotalWorkingDays++ ;      
		    //type casting here to get integer value
	            int Emp_Check  = (int) Math.floor(Math.random() * 10) % 3 ;
            	    // use swith case to choose 0,1,2
        	    switch (Emp_Check){
               		case Is_Full_Time:


	    int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 1;
	    
	    //check total emp hour not more than 100 and total days not more than 20
	    while (totalEmpHrs <= MAX_HRS_IN_MONTH &&
		   totalWorkingDays <= NUM_WORKING_DAYS){
     
	            int emp_Check  = (int) Math.floor(Math.random() * 10) % 3 ;
            
		    //switch case to check emp full time, part time or absent
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
	    int totalEmpWage = totalEmpHrs * EMP_WAGE_PER_HR;
            System.out.println("Total Employee Wage is: "+ totalEmpWage);	  

       }
 
}
