package StreamIntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SortedFive {
	public static void main(String[] args) {
		// sorted(): Returns a stream consisting of the elements of the original stream,
		// sorted according to natural order.
		
		List<Integer> numbers = Arrays.asList(5, 3, 1, 4, 2);
		Stream<Integer> sortedNumbers = numbers.stream().sorted();
		sortedNumbers.forEach(System.out::println); // Prints "1", "2", "3", "4", "5"
	}

}
