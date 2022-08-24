package abhi.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class OptionalDemo {

	public static void main(String[] args) throws Exception {

		Customer customer1 = new Customer(1, "abhi", "abhi@gmail.com");
		Customer customer2 = new Customer(2, "hari", null);
		
//		// Optional Instance with empty()
//		Optional<Object> emptyOptionalInstance = Optional.empty();
//		System.out.println("Optional.empty(): "+emptyOptionalInstance);
//		
//		
//		
//		Optional<Object> ofOptionalInstanceWithNonNullValue = Optional.of(customer1.getcEid());
//		System.out.println("Optional Instance With NonNullValue by of() : "+ofOptionalInstanceWithNonNullValue);
//		
////		Optional<Object> ofOptionalInstanceWithNullValue = Optional.of(customer2.getcEid());
////		System.out.println("Optional Instance With NullValue by of() : "+ofOptionalInstanceWithNullValue);
//		
//		
//		
//		Optional<Object> ofNullableOptionalInstanceWithNullValue  = Optional.ofNullable(customer2.getcEid());
//		System.out.println("Optional Instance With NullValue by ofNullable() : "+ ofNullableOptionalInstanceWithNullValue);
//
//		Optional<Object> ofNullableOptionalInstanceWithNonNullValue  = Optional.ofNullable(customer1.getcEid());
//		System.out.println("Optional Instance With NonNullValue by ofNullable() : "+ ofNullableOptionalInstanceWithNonNullValue);
//		
//		
//		//Getting Exact Value from Optional Instance ==> get() OR orElse(), orElseGet(), orElseThrow()
////		System.out.println("Optional.empty(): "+emptyOptionalInstance.get());
//		// java.util.NoSuchElementException: No value present
//		
//		System.out.println("Optional Instance With NonNullValue by of() : "+ofOptionalInstanceWithNonNullValue.get());
//		
//		
////		System.out.println("Optional Instance With NullValue by ofNullable() : "+ ofNullableOptionalInstanceWithNullValue.get());
//		// java.util.NoSuchElementException: No value present
//		System.out.println("Optional Instance With NonNullValue by ofNullable() : "+ ofNullableOptionalInstanceWithNonNullValue.get());
//
//		
//		
////		java.util.NoSuchElementException ==> Handling
//		
//		if(emptyOptionalInstance.isPresent()) {
//			System.out.println("For Logging ---> emptyOptionalInstance.isPresent()");
//			System.out.println("Optional.empty(): "+emptyOptionalInstance.get());
//			
//		}
//		
//		if(ofOptionalInstanceWithNonNullValue.isPresent()) {
//			System.out.println("For Logging ---> emptyOptionalInstance.isPresent()");
//			System.out.println("Optional Instance With NonNullValue by of() : "+ofOptionalInstanceWithNonNullValue.get());	
//		}
//	
//		
////		orElse() 
//		//System.out.println("orElse With NonNull Value : "+ofNullableOptionalInstanceWithNonNullValue.orElse());
//		System.out.println("orElse() With NonNull Value : "+ofNullableOptionalInstanceWithNonNullValue.orElse(null));
//		System.out.println("orElse With NonNull Value : "+ofNullableOptionalInstanceWithNonNullValue.orElse("xyz@gmail.com"));
//		System.out.println("orElse With Null Value : "+ofNullableOptionalInstanceWithNullValue.orElse("xyz@gmail.com"));
//		
////		orElseGet()
//		System.out.println("orElseGet() With NonNull Value : "+ofNullableOptionalInstanceWithNonNullValue.orElseGet(null));
////		System.out.println("orElseGet() With NonNull Value : "+ofNullableOptionalInstanceWithNonNullValue.orElseGet("xyz@gmail.com"));
//		System.out.println("orElseGet() With NonNull Value : "+ofNullableOptionalInstanceWithNonNullValue
//				.orElseGet(()-> "xyz@gmail.com"));
//
//		
//		System.out.println("orElse With NonNull Value : "+ofNullableOptionalInstanceWithNullValue
//				.orElseThrow(()-> new IllegalArgumentException("Plz Enter Valied Mail Id")));

		
		
//		Optional Instance with map()
//		System.out.println(ofNullableOptionalInstanceWithNonNullValue.map(String::toUpperCase).orElseGet("xyz@gmail.com"));
		
		
		
		Customer customer3 = new Customer(2, "nani", "nani@gmail.com");
		Customer customer4 = new Customer(2, "soni", "soni@gmail.com");
//		Customer customer5 = new Customer(2, "gani", null);


//		Optional Instance with streams
		List<Customer> list = new ArrayList<>();
		list.add(customer3);
		list.add(customer4);

		System.out.println(list);
		
		
		Customer orElseThrow = list.stream()
		.filter(customer -> customer.getcEid().equals("qwer"))
		.findAny()
//		.get();
		.orElseThrow(()->new Exception("Entered Email Id Not Found...!"));
		
		System.out.println(orElseThrow);
		
	
	}
	
}
