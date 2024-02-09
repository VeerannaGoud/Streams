package StreamTerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectFour {
	public static void main(String[] args) {
		// collect(Collector collector): Performs a mutable reduction operation on the
		// elements of the stream using a Collector.
		
		List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tina", "Emily");
	    List<String> namesInUpperCase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
	    System.out.println(namesInUpperCase); // Prints "[JOHN, SARAH, MARK, TINA, EMILY]"
	}

}
