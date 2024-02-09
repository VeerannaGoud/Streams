package StreamIntermediateOperations;

import java.util.Arrays;
import java.util.List;

public class LimitFive {
	public static void main(String[] args) {
		// limit(long maxSize): This method returns a stream consisting of the elements
		// of the original stream, truncated to be no longer than maxSize in length.
		
		
		List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tina", "Emily");
		names.stream()
		     .limit(3)
		     .forEach(System.out::println); // Prints "John", "Sarah", "Mark"
	}
}
