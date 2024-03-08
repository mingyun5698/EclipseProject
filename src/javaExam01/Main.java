package javaExam01;

import java.util.HashSet;
import java.util.Set;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Emploee clerk1 = new Emploee("장보고", "1001", 10000, 8, "Clerk");
		Emploee clerk2 = new Emploee("유관순", "1002", 11000, 8, "Clerk");
		
		Emploee developer1 = new Developer("광개토", "2001", 12000, 8, "Developer", 2);
		Emploee developer2 = new Developer("대조영", "2002", 13000, 8, "Developer", 3);
		
		Emploee manager1 = new Manager("주몽몽", "3001", 17000, 8, "Manager", 500000);
		Emploee manager2 = new Manager("을지문", "3002", 17000, 8, "Manager", 300000);
		
		Emploee salesman1 = new Salesman("이순신", "4001", 6000, 8, "Salesman", 800000);
		Emploee salesman2 = new Salesman("세종대", "4002", 6500, 8, "Salesman", 900000);
		
		Emploee director1 = new Director("장영실", "5001", 11000, 8, "Director", 200000);
		Emploee director2 = new Director("김유신", "5002", 10000, 8, "Director", 300000);
		
		Set <Emploee> emp = new HashSet<>();
		emp.add(clerk1);
		emp.add(clerk2);
		emp.add(developer1);
		emp.add(developer2);
		emp.add(manager1);
		emp.add(manager2);
		emp.add(salesman1);
		emp.add(salesman2);
		emp.add(director1);
		emp.add(director2);
		
		Iterator<Emploee> it = emp.iterator();
		System.out.print("이름 : ");
		while(it.hasNext()) {
			System.out.print(it.next().name + "       ");
		}
		System.out.println(" ");
		
		it = emp.iterator();
		System.out.print("부서 : ");
		while(it.hasNext()) {
			System.out.print(it.next().dept + "    ");
		}
		System.out.println(" ");
		
		it = emp.iterator();
		System.out.print("급여 : ");
		while(it.hasNext()) {
			System.out.print(it.next().clacSalary() + "    ");
		}
		
		
		
		
	
		
		
		
		
		
	
		
	}

}
