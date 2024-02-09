package StreamIntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapTwo {
	public static void main(String[] args) {

		// map(Function mapper): Returns a stream consisting of the results of applying
		// the given function to the elements of the original stream.
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> squares = numbers.stream().map(n -> n * n);
		squares.forEach(System.out::println); // Prints "1", "4", "9", "16", "25"
	}
}
