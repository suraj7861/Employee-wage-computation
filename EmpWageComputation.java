public class EmpWageComputation{

	public static void main(String[] args){

            System.out.println("Welcome to Employee Wage Computation");
	  
            final int Emp_Check = 1;
            int Emp_WagePerHr = 20;
	    int FullDay_Hr = 8;    
            double checkAttendence = Math.floor(Math.random() * 10) % 2 ;
            System.out.println("Random value for emp Attendence check is: "+ checkAttendence);

            if(Emp_Check == checkAttendence){
                int income = Emp_WagePerHr * FullDay_Hr;
                System.out.println("Employee is present");
	        System.out.println("Employee Daily wage is: "+ income);
               }
           else{
                System.out.println("Employee is Absent");	

               }
     }
}
 

