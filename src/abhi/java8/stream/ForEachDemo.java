package abhi.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachDemo {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1, "abhi", "a", 500000));
		list.add(new Employee(2, "nani", "b", 400000));
		list.add(new Employee(3, "kaja", "a", 800000));
		list.add(new Employee(4, "gani", "a", 300000));
		list.add(new Employee(5, "roja", "b", 1500000));
		System.out.println(list);
		
		
		
		// Internal Work Process of forEach()
		for(Employee employee : list) {
			System.out.println(employee);
		}
		System.out.println();
		
		
		//Employee Info : Employee names who's name ends with 'a'
		list.stream().filter(emp -> emp.geteName().endsWith("a")).forEach(emp -> System.out.println(emp));
		System.out.println();
	
				
				
		//Employee Info : tax Payable Employees Under Grade 'a'
		list.stream().filter(emp -> emp.geteSal() >= 500000 && emp.geteGrade().equals("a"))
				.forEach(emp -> System.out.println(emp));
		System.out.println();
	}	
}













