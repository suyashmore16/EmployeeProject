
/**
 * 
 */

/**
 * @author suyas
 *
 */

/*public class EmployeeServer {

	public static void main(String[] args) {
		Employee employeeObjects[];
		employeeObjects = new Employee[10];
		employeeObjects[0] = new Employee("Suyash", 10, 20, 30, 40);
		employeeObjects[1] = new Employee("Bill", 20, 30, 40, 50);
		employeeObjects[2]= new Employee("Bob", 30, 40, 50, 60);
		employeeObjects[3] = new Employee("Suchi", 40, 50, 60, 70);
		employeeObjects[4] = new Employee("Father", 50, 60, 70, 80);
		employeeObjects[5] = new Employee("Anne", 10, 20, 30, 40);
		employeeObjects[6] = new Employee("Jameis", 20, 30, 40, 50);
		employeeObjects[7]= new Employee("Julian", 30, 40, 50, 60);
		employeeObjects[8] = new Employee("Devin", 40, 50, 60, 70);
		employeeObjects[9] = new Employee("Robert", 50, 60, 70, 80);
		EmployeeServer highestQuarterObj = new EmployeeServer();
		double highestQuarterName;
		highestQuarterName = highestQuarterObj.getHighestQuarter(employeeObjects);
		double lowestQuarterName;
		lowestQuarterName = highestQuarterObj.getLowestQuarter(employeeObjects);
		Employee highestQuarterNameLoop[];
		Employee lowestQuarterNameLoop[];
		lowestQuarterNameLoop = highestQuarterObj.getHighestQuarterName(lowestQuarterName, employeeObjects);
		highestQuarterNameLoop = highestQuarterObj.getHighestQuarterName(highestQuarterName, employeeObjects);
		
		System.out.println("The person(s) with the highest quarter are: ");
		for(int i = 0; i < highestQuarterNameLoop.length; i++) {
			if(highestQuarterNameLoop[i] == null) {
				break;
			}
			System.out.print("Employee" + " " + (i+1)  + ":" + " " +  highestQuarterNameLoop[i].getemployeeName());
			System.out.println();
		}
		System.out.println();
		System.out.print("The person(s) with the lowest quarter are ");
		for(int i = 0; i < lowestQuarterNameLoop.length; i++) {
			if(lowestQuarterNameLoop[i] == null) {
				break;
			}
			System.out.print(lowestQuarterNameLoop[i].getemployeeName() + ", ");
		}
		System.out.println();
		double highestTotalName;
		highestTotalName = highestQuarterObj.getHighestTotal(employeeObjects);
		double lowestTotalName;
		lowestTotalName = highestQuarterObj.getLowestTotal(employeeObjects);
		Employee highestTotalNameLoop[];
		Employee lowestTotalNameLoop[];
		lowestTotalNameLoop = highestQuarterObj.getTotalName(lowestTotalName, employeeObjects);
		highestTotalNameLoop = highestQuarterObj.getTotalName(highestTotalName, employeeObjects);
		System.out.print("The person(s) with the highest total are: ");
		for(int i = 0; i < highestTotalNameLoop.length; i++) {
			if(highestTotalNameLoop[i] == null) {
				break;
			}
			System.out.print(highestTotalNameLoop[i].getemployeeName() + ", ");
			
		}
		System.out.println();
		System.out.print("The person(s) with the lowest total are: ");
		for(int i = 0; i < lowestTotalNameLoop.length; i++) {
			if(lowestTotalNameLoop[i] == null) {
				break;
			}
			System.out.print(lowestTotalNameLoop[i].getemployeeName() + ", ");
		}
		System.out.println();
		System.out.println(highestQuarterObj.getSpecificEmployee("Robert", employeeObjects));
		
	}
	/*
	 * Creates array that contains the highest quarter of each employee
	 * for loop that adds highest quarter of each employee to the array as an element
	 * for loop that goes through array and finds the highest quarter of them all by comparing each element to the dynamic highest quarter variable
	 * finds name of the employee with the highest quarter and returns it
	public double getHighestQuarter(Employee employee[]) {
		double highestQuarter = 0;
		double[] employeehighestquarterArray = new double[10];
		for(int count = 0; count < employee.length; count++) {
			employeehighestquarterArray[count] = employee[count].highestQuarter();
			double currentElement = employeehighestquarterArray[count];			
			if(currentElement >= highestQuarter) {
					highestQuarter = currentElement;
			}			
		}
		return highestQuarter;

	}
	public double getLowestQuarter(Employee employee[]) {
		double lowestQuarter = 999999999;
		double[] employeelowestquarterArray = new double[10];
		for(int count = 0; count < employee.length; count++) {
			employeelowestquarterArray[count] = employee[count].lowestQuarter();
			
			double currentElement = employeelowestquarterArray[count];			
			if(currentElement <= lowestQuarter) {
					lowestQuarter = currentElement;
			}
		}
		return lowestQuarter;

}
	public Employee[] getHighestQuarterName(double highestQuarter, Employee employeeArray[]) {
		Employee[] highestQArray = new Employee[10];
		int indice = 0;
		for(int count = 0; count < employeeArray.length; count++) {
			if(highestQuarter == employeeArray[count].getquarterFour() || highestQuarter == employeeArray[count].getquarterOne() || highestQuarter == employeeArray[count].getquarterTwo() || highestQuarter == employeeArray[count].getquarterThree()) {
				highestQArray[indice] = employeeArray[count];
				indice++;
			}
		}
		return highestQArray;
	}
	public Employee getSpecificEmployee(String name, Employee employeeArray[]) {//method that gets the specific employee
		Employee specificEmployeeObj = null; 
		for(int i = 0; i < employeeArray.length; i++) {	//for loop that goes through the array of objects
			boolean stringComparison = (name == employeeArray[i].getemployeeName());	//creates boolean for string comparison
			if(stringComparison == true) {		
			specificEmployeeObj = employeeArray[i];
			}
		}
		return specificEmployeeObj;
	}
	public double getHighestTotal(Employee employee[]) {
		double highestTotal = 0;
		double[] employeeHighestTotalArray = new double[10];
		for(int count = 0; count < employee.length; count++) {
			employeeHighestTotalArray[count] = employee[count].totalSales();
			double currentElement = employeeHighestTotalArray[count];			
			if(currentElement >= highestTotal) {
					highestTotal = currentElement;
			}
		}
		return highestTotal;
	}
	public double getLowestTotal(Employee employee[]) {
		double lowestTotal = 1000000000;
		double[] employeeLowestTotalArray = new double[10];
		for(int count = 0; count < employee.length; count++) {
			employeeLowestTotalArray[count] = employee[count].totalSales();
			double currentElement = employeeLowestTotalArray[count];			
			if(currentElement <= lowestTotal) {
					lowestTotal = currentElement;
			}
		}
		return lowestTotal;
	}
	public Employee[] getTotalName(double highestTotal, Employee employeeArray[]) {
		Employee[] totalArray = new Employee[10];
		int indice = 0;
		for(int count = 0; count < employeeArray.length; count++) {
			if(highestTotal == employeeArray[count].totalSales()) {
				totalArray[indice] = employeeArray[count];
				indice++;
			}
		}
		return totalArray;
	}
	
}*/
