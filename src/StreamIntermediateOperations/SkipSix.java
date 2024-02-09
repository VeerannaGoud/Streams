package StreamIntermediateOperations;

import java.util.Arrays;
import java.util.List;

public class SkipSix {
	public static void main(String[] args) {
		// skip(long n): This method returns a stream consisting of the remaining
		// elements of the original stream after discarding the first n elements of the
		// stream.
		
		List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tina", "Emily");
		names.stream()
		     .skip(2)
		     .forEach(System.out::println); // Prints "Mark", "Tina", "Emily"
		
		
		
		/*List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tina", "Emily");
		List<String> skippedNames = names.stream()
		                                 .skip(2)
		                                 .collect(Collectors.toList());
		System.out.println(skippedNames); // Prints "[Mark, Tina, Emily]"
*/		
	}

}
