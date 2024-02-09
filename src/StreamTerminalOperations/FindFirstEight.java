package StreamTerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstEight {
	public static void main(String[] args) {
		// findFirst(), findAny(): Returns an Optional describing some element of the
		// stream, or an empty Optional if the stream is empty.

		// findFirst(): This method returns an Optional describing the first element of
		// the stream, or an empty Optional if the stream is empty. This is a terminal
		// operation.

		List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tina", "Emily");
		Optional<String> firstName = names.stream().findFirst();
		System.out.println(firstName.get()); // Prints "John"

		// findAny(): This method returns an Optional describing some element of the
		// stream, or an empty Optional if the stream is empty. In parallel operations,
		// this may return any element from the stream, not necessarily the first. This
		// is a terminal operation.
		
		
	/*	List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tina", "Emily");
		Optional<String> anyName = names.stream().findAny();
		System.out.println(anyName.get()); // Prints any name from the list
*/	}
}
