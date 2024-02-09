package StreamIntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DistinctFour {

	public static void main(String[] args) {
		// distinct(): Returns a stream consisting of the distinct elements of the
		// original stream.
		
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
		Stream<Integer> distinctNumbers = numbers.stream().distinct();
		distinctNumbers.forEach(System.out::println); // Prints "1", "2", "3", "4"
	}

}
