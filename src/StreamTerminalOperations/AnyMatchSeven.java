package StreamTerminalOperations;

import java.util.Arrays;
import java.util.List;

public class AnyMatchSeven {
	public static void main(String[] args) {
		// anyMatch(Predicate predicate), allMatch(Predicate predicate),
		// noneMatch(Predicate predicate): Returns whether any elements of the stream
		// match the provided predicate.
		
		 List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tina", "Emily");
		    boolean anyMatch = names.stream().anyMatch(name -> name.startsWith("M"));
		    System.out.println(anyMatch); // Prints "true"
	}

}
