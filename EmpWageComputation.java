public class EmpWageComputation{

	public static void main(String[] args){

            System.out.println("Welcome to Employee Wage Computation");
	  
            final int Emp_Check = 1;
	    int Is_Full_Time=1;
	    int Is_Part_Part=0;
            int Emp_WagePerHr = 20;
	    int FullDay_Hr = 8;
	    int PartTime_Hr=4;
               
            double checkAttendence = Math.floor(Math.random() * 10) % 2 ;
            System.out.println("Random value for emp Attendence check is: "+ checkAttendence);
	    
	    double n = Math.floor(Math.random() * 10) % 2 ;
            System.out.println("Random value for emp full time or part time is: "+ n);

            if(Emp_Check == checkAttendence){

	         if(n == Is_Full_Time){
                      int income = Emp_WagePerHr * FullDay_Hr;
                      System.out.println("Employee is present And Full Time Work");
	              System.out.println("Employee Daily wage is: "+ income);
	          }
	         else{
	              int income = Emp_WagePerHr * PartTime_Hr;
                      System.out.println("Employee is present And Part Time Work");
                      System.out.println("Employee Daily wage is: "+ income);
	          }
               }
           else{
                System.out.println("Employee is Absent");	

               }
     }
}
 

