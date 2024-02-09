package StreamIntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterOne {
	public static void main(String[] args) {
		
   /** Intermediate Operations:**/

		//1. filter(Predicate predicate): Returns a stream consisting of the elements of
		// the original stream that match the given predicate.
		
		List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tina", "Emily");
		Stream<String> longNames = names.stream().filter(name -> name.length() > 4);
		longNames.forEach(System.out::println); // Prints "Sarah", "Emily"
		
		
	}

}
