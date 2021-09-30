public class EmpWageComputation{

	public static void main(String[] args){

            System.out.println("Welcome to Employee Wage Computation");
	  
            int Is_Full_Time = 1;
            int Emp_WagePerHr = 20;
	    int FullDay_Hr = 8;
	    int empHrs = 0;
	    int empWage = 0;    
            double Emp_Check  = Math.floor(Math.random() * 10) % 2 ;
            System.out.println("Random value for emp Attendence check is: "+ Emp_Check);

            if(Emp_Check == Is_Full_Time){
                System.out.println("Employee is present");
	        empHrs = 8;
               }
           else{
                System.out.println("Employee is Absent");
                empHrs = 0;	
               }
	   empWage = empHrs * Emp_WagePerHr;
	   System.out.println("Employee Wage is; "+ empWage);
     }
}
 

