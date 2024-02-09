package StreamTerminalOperations;

import java.util.Arrays;
import java.util.List;

public class CountSix {
	public static void main(String[] args) {
		// count(): Returns the count of elements in the stream.
		 List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tina", "Emily");
		    long count = names.stream().count();
		    System.out.println(count); // Prints "5"
	}

}
