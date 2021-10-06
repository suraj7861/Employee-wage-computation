//package com.employeeWage;
public class EmpWageComputation{
       // create global variables to access in method also
       public static final int Is_Full_Time = 1;
       public static final int Is_Part_Time = 2;
       public static final int Emp_WagePerHr = 20;
       public static final int Num_Working_Days = 20;
       public static final int Max_Hrs_In_Month = 100; 

       public static void main(String[] args){

            System.out.println("Welcome to Employee Wage Computation");
	    int empHrs = 0, totalEmpHrs = 0, TotalWorkingDays = 1;

	    while (totalEmpHrs <= Max_Hrs_In_Month && 
                    TotalWorkingDays <= Num_Working_Days){

                    TotalWorkingDays++ ;      
	            int Emp_Check  = (int) Math.floor(Math.random() * 10) % 3 ;
            	    // use swith case to choose 
        	    switch (Emp_Check){
               		case Is_Full_Time:
                		System.out.println("Employee is present Full Time");
	        		empHrs = 8;
               			break;
               
	   	        case Is_Part_Time:
               			System.out.println("Employee is present Part Time");
	        		empHrs = 4;
				break;
          
              	        default:
                		System.out.println("Employee is Absent");
                		empHrs = 0;	
                        }
		 // calculate total emp hours
                 totalEmpHrs += empHrs;
		 System.out.println("Day :"+ TotalWorkingDays +"Emp Hrs:"+empHrs);
               }
		 // calculate total emp wage
		 int TotalEmpWage = totalEmpHrs * Emp_WagePerHr;
		 System.out.println("Total Employee Wage is; "+ TotalEmpWage);	  

       }
 
}
