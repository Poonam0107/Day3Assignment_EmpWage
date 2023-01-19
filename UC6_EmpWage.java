package Day3Assignment;

public class UC6_EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee  Wage Computation program");
		int Is_Full_Time=1;
		int Is_part_Time=2;
		int wagePerHour=20;
		int fullDayHour=8;
		int partTimeHour=4;
		int workinDayPerMonth=20;
		int isPresent=(int)Math.floor(Math.random()*3);
		switch (isPresent)
		{
		case 0 :
			System.out.println("Employee is present");
			System.out.println("Employee wage="+fullDayHour*wagePerHour);
			int totalHourPerMonth = 1;
			while(totalHourPerMonth<=100)
			{
				totalHourPerMonth++;
			}
			System.out.println("Employee wage="+totalHourPerMonth*wagePerHour);
			break;
		case 1 :
			System.out.println("Employee present as a part time");
			System.out.println("Employee Wage="+partTimeHour*wagePerHour);
		    System.out.println("Employee monthly wage="+partTimeHour*wagePerHour*workinDayPerMonth);
		    break;
		case 2 :
			System.out.println("Employee is Absent");
			System.out.println("Employee Wage=0");
			break;
		}
	}

}
