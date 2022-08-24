package abhi.java8.stream;

import java.util.stream.IntStream;

public class StreamLazyDemo {

	public static void main(String[] args) {

		IntStream stream1 = IntStream.range(1, 6);
		IntStream stream2 = IntStream.range(1, 6);

		// Stream With Terminal Operator 
		long evenNocount = stream1.peek(i -> System.out.println("stream1.peek-" + i))   //peek()==>Used for Debugging Purpose.
				.filter(i -> {
								System.out.println("stream1.filter-" + i);
								return i % 2 == 0;
							})
				.count();
		System.out.println("No of even elements : "+ evenNocount);

		
		
		// Stream With Out Terminal Operator
		stream2.peek(i -> System.out.println("stream2.peek-" + i))
		.filter(i -> {
						System.out.println("stream2.filter-" + i);
						return i % 2 == 0;
					});
	}
}
