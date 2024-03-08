package javaExam01;

public class Developer extends Emploee {

	int overTime;
	
	
	public Developer(String name, String empId, int wage, int workHours, String dept, int overTime) {
		super(name, empId, wage, workHours, dept);
		this.overTime = overTime;
	}
	
	@Override
	public int clacSalary() {
		int result = this.wage*(this.workHours + this.overTime)*25;
		return result;
	}

}
