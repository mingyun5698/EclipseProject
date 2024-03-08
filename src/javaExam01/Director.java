package javaExam01;

public class Director extends Emploee{
	
	int proExpenses;

	public Director(String name, String empId, int wage, int workHours, String dept, int proExpenses) {
		super(name, empId, wage, workHours, dept);
		this.proExpenses = proExpenses;
	}
	
	@Override
	public int clacSalary() {
		int result = this.wage*this.workHours*25 + proExpenses;
		return result;
	}

}
