import java.util.Random;

public class EmpWageComputation{
       public static final int Is_Full_Time = 1;
       public static final int Is_Part_Time = 2;
       public static final int Emp_WagePerHr = 20;

	public static void main(String[] args){	  

	      System.out.println("Welcome to Employee Wage Computation");

	    int empHrs = 0;
	    int empWage = 0;    
            int Emp_Check  = (int) Math.floor(Math.random() * 10) % 3 ;
            System.out.println("Random value for emp Attendence check is: "+ Emp_Check);

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
	    empWage = empHrs * Emp_WagePerHr;
	    System.out.println("Employee Wage is; "+ empWage);  

       }
 
}
