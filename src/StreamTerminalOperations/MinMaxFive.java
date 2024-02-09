package StreamTerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxFive {
	public static void main(String[] args) {
		// min(Comparator comparator), max(Comparator comparator): Returns the minimum
		// or maximum element of the stream according to the provided Comparator.
		
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		 Optional<Integer> min = numbers.stream().min(Integer::compare);
		 System.out.println(min.get()); // Prints "1"
	}

}
