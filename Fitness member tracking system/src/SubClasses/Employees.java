package SubClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employees extends Persons {
	private int employeePassword;
	private double salary;
	private double insuranceCost;
	private int workingHour;
	private int permission;

	private static List<Employees> employeeList = new ArrayList<Employees>();
	Scanner scan = new Scanner(System.in);

	public Employees() {

	}

	public Employees(String name, String surname, String gender, String phone, int idNumber, String address,
			String email, int employeePassword, double salary, double insuranceCost, int workingHour) {
		super(name, surname, gender, phone, idNumber, address, email);
		this.employeePassword = employeePassword;
		this.salary = salary;
		this.insuranceCost = insuranceCost;
		this.workingHour = workingHour;
		this.permission = 0;

	}

	public boolean addEmployee(Employees newEmp) {

		employeeList.add(newEmp);
		System.out.println("Employee added.");
		return true;
	}

	public boolean updateEmployeeForTest(int employeeId) {

		for (Employees e : employeeList) {
			if (e.getIdNumber() == employeeId) {
				System.out.println("\nPlease enter new informations.");

				System.out.println("\nName:");
				e.setName(scan.next().isEmpty() ? this.getName() : scan.next());
				System.out.println("Surname:");
				e.setSurname((scan.next().isEmpty()) ? this.getSurname() : scan.next());
				System.out.println("Phone:");
				e.setPhone((scan.next().isEmpty()) ? this.getPhone() : scan.next());
				System.out.println("Id Number:");
				e.setIdNumber(scan.nextInt());
				System.out.println("Address:");
				e.setAddress((scan.next().isEmpty()) ? this.getAddress() : scan.next());
				System.out.println("Email:");
				e.setEmail(scan.next().isEmpty() ? this.getEmail() : scan.next());
				System.out.println("Salary:");
				e.setSalary(scan.nextFloat());
			}
		}
		System.out.println("Employee updated.");
		return true;
	}

	public boolean updateEmployee(int employeeId, String name, String surname, String gender, String phone,
			String adress, String email, double insurance, double salary, int workinghour) {

		for (Employees e : employeeList) {
			if (e.getIdNumber() == employeeId) {
				e.setIdNumber(employeeId);
				e.setName(name);
				e.setSurname(surname);
				e.setGender(gender);
				e.setPhone(phone);
				e.setInsuranceCost(insurance);
				e.setAddress(adress);
				e.setEmail(email);
				e.setSalary(salary);
				e.setWorkingHour(workinghour);
			}
		}
		System.out.println("Employee updated.");
		return true;
	}

	public String deleteEmployee(int employeeId) {
		String retValue = "";
		for (Employees e : Employees.employeeList) {
			if (e.getIdNumber() == employeeId) {
				retValue += e.getName() + " " + e.getSurname() + " " + e.getIdNumber() + " Deleted.";
				employeeList.remove(e);
				System.out.println("Employee deleted.");
				// this.employeeList=employeeList;
			}
		}

		return retValue;
	}

	public String printAllEmployees() {
		String str = "";
		int i = 1;
		for (Employees e : getEmployeeList()) {
			str += i + ".Member:   " + "ID: " + e.getIdNumber() + "   Name: " + e.getName() + " " + e.getSurname()
					+ "\n";
			i++;

		}
		if (str.equals("")) {
			str = "Can't found.";
		}

		return str;
	}

	public String searchEmployee(int employeeId) {
		String strr = "";
		for (Employees e : employeeList) {
			if (e.getIdNumber() == employeeId) {
				strr += ("\n-----The Employee you have searched-----\nName:" + e.getName() + "\nSurname:"
						+ e.getSurname() + "\nPhone:" + e.getPhone() + "\nId number:" + e.getIdNumber()
						+ "\nEmployee ID:" + e.getIdNumber() + "\nSalary:" + e.getSalary() + "\nInsurance cost:"
						+ e.getInsuranceCost() + "\nWorking hours :" + e.getWorkingHour());
			}
		}
		return strr;
	}

	@Override
	public String toString() {
		int i = 1;
		String str = "";

		for (Employees e : employeeList) {

			str += "\n----------------" + i + ".Employee----------------\nName:" + e.getName() + "\nSurname:"
					+ e.getSurname() + "\nPhone:" + e.getPhone() + "\nId number:" + e.getIdNumber() + "\nEmployee ID:"
					+ e.getIdNumber() + "\nSalary:" + e.getSalary() + "\nInsurance cost:" + e.getInsuranceCost()
					+ "\nWorking hours :" + e.getWorkingHour();
			i++;

		}
		return str;
	}

	public int getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(int employeePassword) {
		this.employeePassword = employeePassword;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getInsuranceCost() {
		return insuranceCost;
	}

	public void setInsuranceCost(double insuranceCost) {
		this.insuranceCost = insuranceCost;
	}

	public int getWorkingHour() {
		return workingHour;
	}

	public void setWorkingHour(int workingHour) {
		this.workingHour = workingHour;
	}

	public List<Employees> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeLis(List<Employees> employeeList) {
		Employees.employeeList = employeeList;
	}

	public int getPermission() {
		return permission;
	}

	public void setPermission(int permission) {
		this.permission = permission;
	}

	public static void setEmployeeList(List<Employees> employeeList) {
		Employees.employeeList = employeeList;
	}

}
