public class EmpWageComputation{

	public static void main(String[] args){

            System.out.println("Welcome to Employee Wage Computation");
	  
            int Full_Time = 1;

            double Emp_Check = Math.floor(Math.random() * 10) % 2 ;
            System.out.println("Random value for emp Attendence check is: "+ Emp_Check);

            if(Emp_Check == Full_Time ){
                System.out.println("Employee is present");
               }
           else{
                System.out.println("Employee is Absent");	

               }
     }
}
 

