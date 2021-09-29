public class EmpWageComputation{

	public static void main(String[] args){

            System.out.println("Welcome to Employee Wage Computation");
	  
            final int Emp_Check = 1;

            double checkAttendence = Math.floor(Math.random() * 10) % 2 ;
            System.out.println("Random value for emp Attendence check is: "+ checkAttendence);

            if(Emp_Check == checkAttendence){
                System.out.println("Employee is present");
               }
           else{
                System.out.println("Employee is Absent");	

               }
     }
}
 

