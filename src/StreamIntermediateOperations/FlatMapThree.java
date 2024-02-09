package StreamIntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapThree {
	public static void main(String[] args) {
		
		// flatMap(Function mapper): Returns a stream consisting of the results of
		// replacing each element of the original stream with the contents of a mapped
		// stream produced by applying the provided mapping function to each element.
		
		List<List<String>> listOfLists = Arrays.asList(
				  Arrays.asList("John", "Sarah"),
				  Arrays.asList("Mark", "Tina")
				);
				Stream<String> flatStream = listOfLists.stream().flatMap(list -> list.stream());
				flatStream.forEach(System.out::println); // Prints "John", "Sarah", "Mark", "Tina"
	}
}
