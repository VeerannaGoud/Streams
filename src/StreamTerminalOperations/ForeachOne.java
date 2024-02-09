package StreamTerminalOperations;

import java.util.Arrays;
import java.util.List;

public class ForeachOne {
	public static void main(String[] args) {
		//forEach(Consumer action): Performs an action for each element of the stream.

		List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tina", "Emily");
		names.stream().forEach(System.out::println); // Prints all names
	}
}
