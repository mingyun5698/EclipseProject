package javaExam01;

public class Manager extends Emploee {

	int mgrAllowance;
	
	public Manager(String name, String empId, int wage, int workHours, String dept, int mgrAllowance) {
		super(name, empId, wage, workHours, dept);
		this.mgrAllowance = mgrAllowance;
	}
	
	@Override
	public int clacSalary() {
		int result = this.wage*this.workHours*25 + mgrAllowance;
		return result;
	}

}
