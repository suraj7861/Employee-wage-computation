public class EmpWageComputation{

	public static void main(String[] args){

            System.out.println("Welcome to Employee Wage Computation");
	  
            int Is_Full_Time = 1;
	    int Is_Part_Time = 2;
            int Emp_WagePerHr = 20;
	    int empHrs = 0;
	    int empWage = 0;    
            double Emp_Check  = Math.floor(Math.random() * 10) % 3 ;
            System.out.println("Random value for emp Attendence check is: "+ Emp_Check);

            if(Emp_Check == Is_Full_Time){
                System.out.println("Employee is present Full Time");
	        empHrs = 8;
               }
	    else if((Emp_Check == Is_Part_Time)){
               System.out.println("Employee is present Part Time");
	        empHrs = 4;
               }
            else{
                System.out.println("Employee is Absent");
                empHrs = 0;	
               }
	    empWage = empHrs * Emp_WagePerHr;
	    System.out.println("Employee Wage is; "+ empWage);  
	     
        }
}
