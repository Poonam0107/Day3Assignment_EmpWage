package Day3Assignment;

public class UC3_EmpWage {

	public static void main(String[] args) {
		 System.out.println("Welcome Wage Computation Program");
		 int Is_Full_Time=1;
		 int wagePerHour=20;
		 int fullDayHour=8;
		 int partTimeHour=4;
		 double empCheck=Math.floor(Math.random()*10)%3;
		 if(empCheck==Is_Full_Time)
		 {
			 System.out.println("Employee is Present");
			 System.out.println("Employee daily Wage="+fullDayHour*wagePerHour);
		 }
		 else if(empCheck==0)
		 {
			 System.out.println("Employee is Absent");
		 }
		 else
		 {
			 System.out.println("Empolyee working as as Part Time");
			 
			 System.out.println("Employee part time wage :"+partTimeHour*wagePerHour);
		 }
			 
	}

}
