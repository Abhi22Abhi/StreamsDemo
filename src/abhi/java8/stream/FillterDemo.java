package abhi.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FillterDemo {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1, "abhi", "a", 500000));
		list.add(new Employee(2, "nani", "b", 400000));
		list.add(new Employee(3, "kaja", "a", 800000));
		list.add(new Employee(4, "gani", "a", 300000));
		list.add(new Employee(5, "roja", "b", 1500000));
		System.out.println(list);
		
		
		
		// Internal Work Process of filter()
		for(Employee employee : list) {
			employee.geteName().endsWith("a");
		}
		
		
		
		//Employee Info : Employee names who's name ends with 'a'
				List<Employee> nameEndsWithA = list.stream()
						.filter(emp -> emp.geteName().endsWith("a"))
						.collect(Collectors.toList());
				System.out.println(nameEndsWithA);
				
				
				
		//Employee Info : tax Payable Employees Under Grade 'a'
		List<Employee> taxPayableAndGrade_A_Emp = list.stream().filter(emp -> emp.geteSal()>=500000 && emp.geteGrade().equals("a"))
				.collect(Collectors.toList());
		System.out.println(taxPayableAndGrade_A_Emp);
	
	}	
}



////Proper Standard Way of Coding
//public static List<Employee> employeeNameStartsWith(String input) {
//
//	if (input.equalsIgnoreCase("A")) {
//		List<Employee> nameStartsWithA = EmployeeDaoDummy.getEmployees().stream()
//				.filter(emp -> emp.geteName().startsWith(input)).collect(Collectors.toList());
//		return nameStartsWithA;
//	}else {
//		return null;
//	}
//	//Not working for "A"
//}

//System.out.println("employeeNameStartsWith(\"a\") :"+employeeNameStartsWith("a"));
//System.out.println("employeeNameStartsWith(\"A\") :"+employeeNameStartsWith("A"));













