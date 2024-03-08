package javaExam01;

public class Emploee implements Salary{
	String name;
	String empId;
	int wage;
	int workHours;
	String dept;
	
	
	
	@Override
	public int clacSalary() {
		int result = this.wage*this.workHours*25;
		return result;
	}
	
	@Override
	public String toString() {
		return "Emploee::toString";
	}
	
	public Emploee(String name, String empId, int wage, int workHours, String dept) {
		this.name = name;
		this.empId = empId;
		this.wage = wage;
		this.workHours = workHours;
		this.dept = dept;
	}
	
}
