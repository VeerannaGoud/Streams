package StreamTerminalOperations;

import java.util.Arrays;
import java.util.List;

public class ToArrayTwo {
	public static void main(String[] args) {
		// toArray(): Returns an array containing the elements of the stream.
		List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tina", "Emily");
		String[] namesArray = names.stream().toArray(String[]::new);
		System.out.println(Arrays.toString(namesArray)); // Prints "[John, Sarah, Mark, Tina, Emily]"
	}

}
