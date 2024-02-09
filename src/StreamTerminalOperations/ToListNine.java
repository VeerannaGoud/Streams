package StreamTerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToListNine {
	public static void main(String[] args) {
		// The toList() method is a built-in method in the Stream interface in Java 8
		// and later versions. It collects the elements of the stream into a new List.
		// Here's an example:
		
		List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tina", "Emily");
		List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCaseNames); // Prints "[JOHN, SARAH, MARK, TINA, EMILY]"

		// In this example, the map operation is used to convert each name in the names
		// list to uppercase. The collect operation is then used with
		// Collectors.toList() to collect the results into a new list, which is stored
		// in the upperCaseNames variable.
	}

}
