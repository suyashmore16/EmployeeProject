
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
 * @author 22smore
 *
 */
public class EmployeeClient extends GBFrame{
	int employeeCount = 1;
	JLabel inputEmployee = addLabel("Input Employee Below:", 1, 1, 1, 1);	//initialized labels, text fields, and double fields for employees to be inputted
	JTextField inputEmployeeName = addTextField("Insert Name", 2, 1, 1, 1);
	DoubleField inputq1field = addDoubleField(0.00, 2, 2, 1, 1);
	DoubleField inputq2field = addDoubleField(0.00, 2, 3, 1, 1);
	DoubleField inputq3field = addDoubleField(0.00, 2, 4, 1, 1);
	DoubleField inputq4field = addDoubleField(0.00, 2, 5, 1, 1);
	JButton inputEmployeeButton = addButton("Input", 3, 1, 1, 1);
	JButton allEmployeeData = addButton("All Employee Data", 3, 2, 1, 1);
	JButton highestQandTotal = addButton("Highest Quarter and Total", 3, 3, 1, 1);
	JButton lowestQandTotal = addButton("Lowest Quarter and Total", 3, 4, 1, 1);
	JButton SpecificEmployee = addButton("Specific Employee", 3, 5, 1, 1);
	JButton inputEmployeeButtonMenu = addButton("Input Another Employee", 3, 6, 1, 1);
	JLabel SpecificEmployeeName = addLabel("Employee Name", 1, 1, 1, 1);
	JButton inputSpecEmployee = addButton("Input", 3, 1, 1, 1);
	JTextField inputSpecEmployeeName = addTextField("Input Name", 2, 1, 1, 1);
	Employee[] newObj = new Employee[10];
	public EmployeeClient() {
		inputSpecEmployee.setVisible(false);
		inputSpecEmployeeName.setVisible(false);
			allEmployeeData.setVisible(false);
			highestQandTotal.setVisible(false);
			lowestQandTotal.setVisible(false);
		    SpecificEmployee.setVisible(false);
			SpecificEmployeeName.setVisible(false);
			inputEmployeeButtonMenu.setVisible(false);

	}
	public void buttonClicked(JButton buttonObj){	//if the input employee button is clicked
		if(buttonObj == inputEmployeeButtonMenu) {
			inputEmployee.setVisible(true);
			inputq1field.setVisible(true);
			inputq2field.setVisible(true);
			inputq3field.setVisible(true);
			inputq4field.setVisible(true);
			inputEmployeeButton.setVisible(true);
			allEmployeeData.setVisible(true);
			SpecificEmployeeName.setVisible(false);
			allEmployeeData.setVisible(false);
			highestQandTotal.setVisible(false);
			lowestQandTotal.setVisible(false);
			SpecificEmployee.setVisible(false);
			inputSpecEmployeeName.setVisible(false);
			inputEmployeeButton.setVisible(true);
			inputEmployeeName.setVisible(true);
			inputEmployeeButtonMenu.setVisible(false);

		}
		if(buttonObj == inputEmployeeButton) {
			if(employeeCount >= 2) {
				inputEmployee.setVisible(false);
				inputq1field.setVisible(false);
				inputq2field.setVisible(false);
				inputq3field.setVisible(false);
				inputq4field.setVisible(false);
				allEmployeeData.setVisible(true);
				SpecificEmployeeName.setVisible(false);
				allEmployeeData.setVisible(true);
				highestQandTotal.setVisible(true);
				lowestQandTotal.setVisible(true);
				SpecificEmployee.setVisible(true);
				inputSpecEmployeeName.setVisible(false);
				inputEmployeeButton.setVisible(false);
				inputEmployeeName.setVisible(false);
				inputEmployeeButtonMenu.setVisible(true);
			}
			if(inputq1field.isValidNumber() == false || inputq2field.isValidNumber() == false || inputq3field.isValidNumber() == false || inputq4field.isValidNumber() == false) {
				messageBox("Please input a valid number for all four quarters");
			} else {
			String empName = inputEmployeeName.getText(); 	//sets employee name and quarters to the text in the text fields
			double q1 = inputq1field.getNumber();
			double q2 = inputq2field.getNumber();
			double q3 = inputq3field.getNumber();
			double q4 = inputq4field.getNumber();
			newObj[(employeeCount-1)] = new Employee(empName, q1, q2, q3, q4);
			EmpServer EmpServerObj = new EmpServer();
			EmpServerObj.setEmployeeObj(newObj, (employeeCount-1));
			inputEmployeeName.setText("Input Name");	
			inputq1field.setNumber(0.0);	//resets values after getting the values and inputting them into the text field
			inputq2field.setNumber(0.0);
			inputq3field.setNumber(0.0);
			inputq4field.setNumber(0.0);
			employeeCount++;
			}
		}
		if(buttonObj == allEmployeeData) {
			for(int i = 0; i < newObj.length; i++) {
				if(newObj[i] == null) {
					break;
				}
				messageBox(newObj[i].toString());

			}
		}
		if(buttonObj == highestQandTotal) {
			EmpServer employeeObj = new EmpServer();
			messageBox("Highest quarter: " + employeeObj.getHighestQuarterEmpName(newObj) + "\n" + "Highest Total: " + employeeObj.getHighestTotalEmpName(newObj));
		}
		if(buttonObj == lowestQandTotal) {
			EmpServer employeeObj = new EmpServer();
			messageBox("Lowest quarter: " + employeeObj.getLowestQuarterEmpName(newObj) + "\n" + "Lowest Total: " + employeeObj.getLowestTotalEmpName(newObj));
		}
		if(buttonObj == SpecificEmployee) {
			inputEmployee.setVisible(false);
			inputq1field.setVisible(false);
			inputq2field.setVisible(false);
			inputq3field.setVisible(false);
			inputq4field.setVisible(false);
			allEmployeeData.setVisible(false);
			allEmployeeData.setVisible(false);
			highestQandTotal.setVisible(false);
			lowestQandTotal.setVisible(false);
			SpecificEmployee.setVisible(false);
			inputSpecEmployeeName.setVisible(false);
			inputEmployeeButton.setVisible(false);
			inputEmployeeName.setVisible(false);
			SpecificEmployeeName.setVisible(true);
			inputSpecEmployee.setVisible(true);
			inputSpecEmployeeName.setVisible(true);
		}
		if(buttonObj == inputSpecEmployee) {
			String specificEmployeeName = inputSpecEmployeeName.getText();
			EmpServer ServerObj = new EmpServer();
			Employee[] SpecificEmployee = ServerObj.getSpecificEmployee(specificEmployeeName, newObj);
			for(int i = 0; i < SpecificEmployee.length;i++) {
				if(SpecificEmployee[i] == null) {
					break;
				}
				messageBox(SpecificEmployee[i].toString());
			}

		}
	}		
	public static void main(String[] args){
		JFrame frm = new EmployeeClient();
		frm.setTitle ("Ace Widget Program");
		frm.setSize (5000, 1000);
		frm.setVisible (true);
    
	}
	
}
