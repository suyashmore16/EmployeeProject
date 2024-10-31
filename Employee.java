import javax.swing.*;
import BreezySwing.*;
/**
 * 
 */

/**
 * @author suyas
 *
 */
public class Employee {
	private String employeeName;
	private double q1;
	private double q2;
	private double q3;
	private double q4;
	private double totalSales;
	public Employee() {
		
	}
	public Employee(String name, double quart1, double quart2, double quart3, double quart4) {
		employeeName = name;
		q1 = quart1;
		q2 = quart2;
		q3 = quart3;
		q4 = quart4;
		totalSales = 0;

	}
	
	public String getemployeeName() {
		return employeeName;
	}

	public double getquarterOne() {
		return q1;
	}
	public double getquarterTwo() {
		return q2;
	}
	public double getquarterThree() {
		return q3;
	}
	public double getquarterFour() {
		return q4;
	}
	public double totalSales() {
		totalSales = q1 + q2 + q3 + q4;
		return totalSales;
	}
	public String toString() {
		String empName = getemployeeName();
		double quarter1 = q1;
		double quarter2 = q2;
		double quarter3 = q3;
		double quarter4 = q4;
		String employeeStatement = ("Employee Name: " + empName);
		String quarter1Statement = ("\n Quarter One: $" + quarter1);
		String quarter2Statement = ("\n Quarter Two:: $"  + quarter2);
		String quarter3Statement = ("\n Quarter Three: $" + quarter3);
		String quarter4Statement = ("\n Quarter Four: $" + quarter4);
		double totalSalesNum = totalSales();
		double highestQuarterNum = highestQuarter();
		double lowestQuarterNum = lowestQuarter();
		String totalSalesStatement = ("\n Total Sales: $" + totalSalesNum);
		String highestQStatement = ("\n Highest Quarter: $" + highestQuarterNum);
		String lowestQStatement = ("\n Lowest Quarter: $" + lowestQuarterNum);
		return String.format(employeeStatement + quarter1Statement + quarter2Statement + quarter3Statement + quarter4Statement + totalSalesStatement + highestQStatement + lowestQStatement);
		}
	public double highestQuarter() {
		double quarter1 = q1;
		double quarter2 = q2;
		double quarter3 = q3;
		double quarter4 = q4;
		double highestQuarter = 0;
		double[] employee1quarterArray = new double[] {quarter1, quarter2, quarter3, quarter4};
		for(int count = 0; count < employee1quarterArray.length; count++) {
			double currentElement = employee1quarterArray[count];
			if(currentElement > highestQuarter) {
				highestQuarter = currentElement;
			}
			
		}
		return highestQuarter;
	}
	public double lowestQuarter() {
		double quarter1 = q1;
		double quarter2 = q2;
		double quarter3 = q3;
		double quarter4 = q4;
		double lowestQuarter = quarter1;
		double[] employee1quarterArray = new double[] {quarter1, quarter2, quarter3, quarter4};
		for(int count = 0; count < employee1quarterArray.length; count++) {
			double previousElement = employee1quarterArray[0];
			double currentElement = employee1quarterArray[count];
			if(currentElement < lowestQuarter) {
				lowestQuarter = currentElement;
			}
			
		}
		return lowestQuarter;
	}
}

