/**
 * 
 */

/**
 * @author suyas
 *
 */
	import javax.swing.*;
	import BreezySwing.*;
	/**
	 * 
	 */

	/**
	 * @author suyas
	 *
	 */

	public class EmpServer {
		Employee employeeObjects[] = new Employee[10];
		/*
		 * Creates array that contains the highest quarter of each employee
		 * for loop that adds highest quarter of each employee to the array as an element
		 * for loop that goes through array and finds the highest quarter of them all by comparing each element to the dynamic highest quarter variable
		 * finds name of the employee with the highest quarter and returns it
		 */
		public double getHighestQuarter(Employee employee[]) {
			double highestQuarter = 0;
			double[] employeehighestquarterArray = new double[10];
			for(int count = 0; count < employee.length; count++) {
				if(employee[count] == null) {
					break;
				}
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
				if(employee[count] == null)
					break;
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
				if(employeeArray[count] == null) {
					break;
				}
				if(highestQuarter == employeeArray[count].getquarterFour() || highestQuarter == employeeArray[count].getquarterOne() || highestQuarter == employeeArray[count].getquarterTwo() || highestQuarter == employeeArray[count].getquarterThree()) {
					highestQArray[indice] = employeeArray[count];
					indice++;
				}
			}
			return highestQArray;
		}
		public Employee[] getSpecificEmployee(String name, Employee employeeArray[]) {//method that gets the specific employee
			Employee[] specificEmployeeObj = new Employee[10];
			int indice = 0;
			for(int i = 0; i < employeeArray.length; i++) {	//for loop that goes through the array of objects
				if(employeeArray[i]==null) {
					break;
				}
				boolean stringComparison = (name.equals(employeeArray[i].getemployeeName()));	//creates boolean for string comparison
				if(stringComparison == true) {		
					specificEmployeeObj[indice] = employeeArray[i];
					indice++;
				}
			}
			return specificEmployeeObj;
		}
		public double getHighestTotal(Employee employee[]) {
			double highestTotal = 0;
			double[] employeeHighestTotalArray = new double[10];
			for(int count = 0; count < employee.length; count++) {
				if(employee[count] == null) {
					break;
				}
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
				if(employee[count] == null) {
					break;
				}
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
				if(employeeArray[count] == null) {
					break;
				}
				if(highestTotal == employeeArray[count].totalSales()) {
					totalArray[indice] = employeeArray[count];
					indice++;
				}
			}
			return totalArray;
		}
		public String getHighestQuarterEmpName(Employee[] employeeObjArray) {
			double highestQuarterName;
			String highestQuarterNameEmp = "";
			highestQuarterName = getHighestQuarter(employeeObjArray);
			Employee highestQuarterNameLoop[];
			highestQuarterNameLoop = getHighestQuarterName(highestQuarterName, employeeObjArray);
			for(int i = 0; i < highestQuarterNameLoop.length; i++) {
				if(highestQuarterNameLoop[i] == null) {
					break;
				}
				highestQuarterNameEmp = (highestQuarterNameEmp + " " + highestQuarterNameLoop[i].getemployeeName());
				
			}
			return highestQuarterNameEmp;
		}
		public String getLowestQuarterEmpName(Employee[] employee) {
			EmpServer highestQuarterObj = new EmpServer();
			double lowestQuarterName;
			String lowestQuarterNameEmp = "";
			lowestQuarterName = highestQuarterObj.getLowestQuarter(employee);
			Employee lowestQuarterNameLoop[];
			lowestQuarterNameLoop = highestQuarterObj.getHighestQuarterName(lowestQuarterName, employee);
			for(int i = 0; i < lowestQuarterNameLoop.length; i++) {
				if(lowestQuarterNameLoop[i] == null) {
					break;
				}
				lowestQuarterNameEmp = (lowestQuarterNameEmp + " " + lowestQuarterNameLoop[i].getemployeeName());
			}
			return lowestQuarterNameEmp;	
		}
		public String getHighestTotalEmpName(Employee[] employee) {
			EmpServer highestQuarterObj = new EmpServer();
			double highestTotalName;
			String highestTotalNameEmp = "";
			highestTotalName = highestQuarterObj.getHighestTotal(employee);
			Employee highestTotalNameLoop[];
			highestTotalNameLoop = highestQuarterObj.getTotalName(highestTotalName, employee);
			for(int i = 0; i < highestTotalNameLoop.length; i++) {
				if(highestTotalNameLoop[i] == null) {
					break;
				}
				 highestTotalNameEmp = (highestTotalNameEmp + " " + highestTotalNameLoop[i].getemployeeName());
				
			}
			return highestTotalNameEmp;
		}
		public String getLowestTotalEmpName(Employee[] employee) {
			EmpServer highestQuarterObj = new EmpServer();
			String lowestTotalEmpName = "";
			double lowestTotalName;
			lowestTotalName = highestQuarterObj.getLowestTotal(employee);

			Employee lowestTotalNameLoop[];
			lowestTotalNameLoop = highestQuarterObj.getTotalName(lowestTotalName, employee);
			for(int i = 0; i < lowestTotalNameLoop.length; i++) {
				if(lowestTotalNameLoop[i] == null) {
					break;
				}
				lowestTotalEmpName =  (lowestTotalEmpName + " " + lowestTotalNameLoop[i].getemployeeName());
			}
			return lowestTotalEmpName;
		}
		/*
		 * Overload toString method for outputting all employees and outputs in a user-friendly format
		 */
		public String toString() {
			String employeeStatement = null;
			String quarter1Statement = null;
			String quarter2Statement = null;
			String quarter3Statement = null;
			String quarter4Statement = null;
			String totalSalesStatement = null;
			String highestQStatement = null;
			String lowestQStatement = null;
			for(int i = 0; i < employeeObjects.length; i++) {
				String empName = employeeObjects[i].getemployeeName();
				double quarter1 = employeeObjects[i].getquarterOne();
				double quarter2 = employeeObjects[i].getquarterTwo();
				double quarter3 = employeeObjects[i].getquarterThree();
				double quarter4 = employeeObjects[i].getquarterFour();;
				employeeStatement = ("Employee Name: " + empName);
				quarter1Statement = ("\n Quarter One: $" + quarter1);
				quarter2Statement = ("\n Quarter Two:: $"  + quarter2);
				quarter3Statement = ("\n Quarter Three: $" + quarter3);
				quarter4Statement = ("\n Quarter Four: $" + quarter4);
				double totalSalesNum = employeeObjects[i].totalSales();
				double highestQuarterNum = employeeObjects[i].highestQuarter();
				double lowestQuarterNum = employeeObjects[i].lowestQuarter();
				totalSalesStatement = ("\n Total Sales: $" + totalSalesNum);
				highestQStatement = ("\n Highest Quarter: $" + highestQuarterNum);
				lowestQStatement = ("\n Lowest Quarter: $" + lowestQuarterNum);
			}
			return String.format(employeeStatement + quarter1Statement + quarter2Statement + quarter3Statement + quarter4Statement + totalSalesStatement + highestQStatement + lowestQStatement);
			}
		public void setEmployeeObj(Employee[] EmployeeObj, int count) {
			employeeObjects[count] = EmployeeObj[count];
		}
	}
