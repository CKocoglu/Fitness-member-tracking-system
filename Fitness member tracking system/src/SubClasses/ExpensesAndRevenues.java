package SubClasses;

import java.util.List;

public class ExpensesAndRevenues {
	private double membersRevenue;
	private double employeeExpense;
	private double electricityBill;
	private double waterBill;
	private double materialExpenses;
	private double renewalExpenses;
	private double totalRenevue;
	private double totalExpense;
	
	public ExpensesAndRevenues() {
		
	}
	public ExpensesAndRevenues(double membersRevenue, double employeeExpense, double electricityBill, double waterBill,
			double materialExpenses, double renewalExpenses) {
		super();
		this.membersRevenue = membersRevenue;
		this.employeeExpense = employeeExpense;
		this.electricityBill = electricityBill;
		this.waterBill = waterBill;
		this.materialExpenses = materialExpenses;
		this.renewalExpenses = renewalExpenses;
		
	}
	
	public double calculateRevenue(List<Members>memList) {
		double totalRenevue = 0;
		for(Members m : memList) {
			totalRenevue+=m.getDebt();
		}
		return totalRenevue;
	}
	public double calculateEmployeExpenses(List<Employees>empList) {
		double totalSalary = 0;
		for(Employees e : empList) {
			totalSalary+=e.getSalary();
		}
		return totalSalary;
	}
	public double calculateExpenses(double electricityBill,double waterBill,double materialExpenses,double renewalExpenses,double employeeExpense) {
		double totalExpense;
		totalExpense=electricityBill+waterBill+materialExpenses+renewalExpenses;
		return totalExpense;
	
	}
	public double ExpensesAndRenevues() {
		
		return this.getTotalRenevue()-this.getTotalExpense();
	}
	
	
	
	@Override
	public String toString() {
		return "ExpensesAndRevenues [membersRevenue=" + membersRevenue + ", employeeExpense=" + employeeExpense
				+ ", electricityBill=" + electricityBill + ", waterBill=" + waterBill + ", materialExpenses="
				+ materialExpenses + ", renewalExpenses=" + renewalExpenses + "]";
	}


	
	public double getTotalRenevue() {
		return totalRenevue;
	}

	public void setTotalRenevue(double totalRenevue) {
		this.totalRenevue = totalRenevue;
	}

	public double getTotalExpense() {
		return totalExpense;
	}

	public void setTotalExpense(double totalExpense) {
		this.totalExpense = totalExpense;
	}

	public double getMembersRevenue() {
		return membersRevenue;
	}
	public void setMembersRevenue(double membersRevenue) {
		this.membersRevenue = membersRevenue;
	}
	public double getEmployeeExpense() {
		return employeeExpense;
	}
	public void setEmployeeExpense(double employeeExpense) {
		this.employeeExpense = employeeExpense;
	}
	public double getElectricityBill() {
		return electricityBill;
	}
	public void setElectricityBill(double electricityBill) {
		this.electricityBill = electricityBill;
	}
	public double getWaterBill() {
		return waterBill;
	}
	public void setWaterBill(double waterBill) {
		this.waterBill = waterBill;
	}
	public double getMaterialExpenses() {
		return materialExpenses;
	}
	public void setMaterialExpenses(double materialExpenses) {
		this.materialExpenses = materialExpenses;
	}
	public double getRenewalExpenses() {
		return renewalExpenses;
	}
	public void setRenewalExpenses(double renewalExpenses) {
		this.renewalExpenses = renewalExpenses;
	}
	
	
}
