package management;


class Employee {
	String name;
	String jobTitle;
	int yearsOfExperience;
	
	String[] names = new String[10];
	String[] jobTitles = new String[10];
	int[] yearsOfExperiences = new int[10];
	
	public Employee(String name, String jobTitle, int yearsOfExperience) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.yearsOfExperience = yearsOfExperience;
		
		
	}
	
	public Employee() {
		this("이름 없음", "업무 없음", 0);
	}
	
	public void print(Employee instance) {
		System.out.println("이름은 " + instance.name + "이고 업무는 " + instance.jobTitle + "이고 경력은 " + instance.yearsOfExperience + "년 입니다.");
	}
}