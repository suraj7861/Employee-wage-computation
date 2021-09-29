import java.util.Random;

public class EmpWageComputation{

	public static void main(String[] args){

            System.out.println("Welcome to Employee Wage Computation");
	  
            final int Emp_Check = 1;
	    int Is_Full_Time = 1;
	    int Is_Part_Part = 0;
            int Emp_WagePerHr = 20;
	    int FullDay_Hr = 8;
	    int PartTime_Hr = 4;
	    int income = 0;
               
           
            Random rand = new Random();
            int m = rand.nextInt(3);
             //double n = Math.floor(Math.random() * 10) % 2 ;
	    
            switch(m){

	       case 1:
	             
                       income = Emp_WagePerHr * FullDay_Hr;
                       System.out.println("Employee is present And Full Time Work");
	               System.out.println("Employee Daily wage is: "+ income);
	        	break;

	          
	        case 0:

	                income = Emp_WagePerHr * PartTime_Hr;
                        System.out.println("Employee is present And Part Time Work");
                        System.out.println("Employee Daily wage is: "+ income);
		        break;

			    
                default:
                 	System.out.println("Employee is Absent and income is:"+ income);
	                break;
                 
                  }
     
       }
 
}
