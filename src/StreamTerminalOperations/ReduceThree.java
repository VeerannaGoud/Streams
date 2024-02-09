package StreamTerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceThree {
	public static void main(String[] args) {
		// reduce(BinaryOperator accumulator)`: Performs a reduction on the elements of
		// the stream using an associative accumulation function and returns an Optional
		// describing the reduced value, if any.
		
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		 Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
		 System.out.println(sum.get()); // Prints "15"
	}

}
