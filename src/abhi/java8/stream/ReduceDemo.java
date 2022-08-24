package abhi.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			list.add(i);
		}

		// Not a Parallel Processing or Not a Functional Programming Language
		int sum = 0;
		for (Integer i1 : list) {
			sum = sum + i1;
		}
		System.out.println("Non Functional Programing : "+sum);

		// Parallel Processing or Functional Programming Language
		System.out.println("Functional Programming ");
		int sum1 = list.stream().mapToInt(i -> i).sum();
		System.out.println("mapToInt(i -> i).sum(); :- "+sum1);
		
//		Optional<Integer> reduce = list.stream().reduce((a,b)-> a+b);
//		System.out.println("Functional Programming ===> reduce((a,b)-> a+b); :- "+reduce);
		
		Integer integer = list.stream().reduce((a,b)-> a+b).get();
		System.out.println("reduce((a,b)-> a+b).get(); :- "+integer);
		
		Integer integer1 = list.stream().reduce((a,b)-> a+b).orElse(0);
		System.out.println("reduce((a,b)-> a+b).orElse(0); :- "+integer1);
		
		
		
		Integer reduceWithIdentifierThree = list.stream().reduce(3, (a,b)-> a+b);
		System.out.println("reduce(3, (a,b)-> a+b); :- "+reduceWithIdentifierThree);
		Integer reduceWithIdentifierZero = list.stream().reduce(0, (a,b)-> a+b);
		System.out.println("Functional Programming ===> reduce(0, (a,b)-> a+b); :- "+reduceWithIdentifierZero);
		Integer reduceWithIdentifierOne = list.stream().reduce(1, (a,b)-> a+b);
		System.out.println("Functional Programming ===> reduce(1, (a,b)-> a+b); :- "+reduceWithIdentifierOne);
//		Integer integer1 = list.stream().reduce(0, (a,b)-> a+b).orElse(0);
//		Integer integer1 = list.stream().reduce(0, (a,b)-> a+b).get();
		
		
		Integer reduceWithIdentifierZeroMul = list.stream().reduce(0, (a,b)-> a*b);
		System.out.println("reduce(0, (a,b)-> a*b); :- "+reduceWithIdentifierZeroMul);
		
		Integer reduceWithIdentifierOneMul1 = list.stream().reduce(1, (a,b)-> a*b);
		System.out.println("reduce(0, (a,b)-> a*b); :- "+reduceWithIdentifierOneMul1);
		
		Short  reduceWithIdentifierOneMul2 = list.stream().reduce(1, (a,b)-> a*b).shortValue();
		System.out.println("reduce(0, (a,b)-> a*b); :- "+reduceWithIdentifierOneMul2);
		
		
		//Reduce to perform calculations on Employee Data.
		
//		Employee employee1 = new Employee(sum1, null, null)
		
		
		
		
		
		
		
		
		
		
	}
}
