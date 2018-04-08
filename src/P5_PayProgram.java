import java.util.Scanner;

/*
	ISYS 320
	Name(s):drew schulte
	Date: april 8
*/

public class P5_PayProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println("10 ");
		double hourlyRate = input.nextDouble();
		
		System.out.println("50");
		int numOfHoursWorked = input.nextInt();
		
		double pay = computePay(hourlyRate, numOfHoursWorked); 
		System.out.println("Total Pay = " + pay);

	}
	public static double computePay(double hourlyRate, int numOfHoursWorked) {
		double computePay; 
		if (numOfHoursWorked < 8) 
			computePay = hourlyRate * numOfHoursWorked; 
		else
			computePay = (hourlyRate * numOfHoursWorked) + (1.5 * (hourlyRate * (numOfHoursWorked - 8))); 
		return computePay; 

	}

}
