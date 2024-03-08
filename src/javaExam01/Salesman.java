package javaExam01;

public class Salesman extends Emploee {

	
	int incentive;
	
	public Salesman(String name, String empId, int wage, int workHours, String dept, int incentive) {
		super(name, empId, wage, workHours, dept);
		this.incentive = incentive;
	}
	
	@Override
	public int clacSalary() {
		int result = this.wage*this.workHours*25 + this.incentive;
		return result;
	}
	
}
