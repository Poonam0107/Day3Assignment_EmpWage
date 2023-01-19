package Day3Assignment;

public class UC5_EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee  Wage Computation program");
		int Is_Full_Time=1;
		int Is_part_Time=2;
		int wagePerHour=20;
		int fullDayHour=8;
		int partTimeHour=4;
		int workingDayPerMonth=20;
		int isPresent = (int) Math.floor(Math.random()*3);
		switch (isPresent)
		{
		case 0 :
			System.out.println("Employee is present");
			System.out.println("Employee wage="+fullDayHour*wagePerHour);
		
			 System.out.println("Employee monthly Wage="+fullDayHour*wagePerHour*workingDayPerMonth);
			 break;
		case 1:
			System.out.println("Employee is Present as a part Time");
			 System.out.println("Employee Wage="+partTimeHour*wagePerHour*workingDayPerMonth);
			 break;
		case 2:
			System.out.println("Employee is Absent");
			 System.out.println("Employee  Wage=0");
			 break;
		}

	}

}
