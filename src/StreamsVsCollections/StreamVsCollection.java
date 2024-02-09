package StreamsVsCollections;


import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;


public class StreamVsCollection {

    public static void main(String[] args){
    	
    	 List<String> names = new ArrayList<>();
    	 names.add("Veeru");
         names.add("Mike");
         names.add("Syed");
         names.add("Rajeev");
         names.add("Test");
         System.out.println("--------");
         System.out.println(names);

         names.remove("Test");
         System.out.println("--------");
         System.out.println(names);

         for (String name:names){
             System.out.println(name);
         }
         System.out.println("--------");

         System.out.println("******using Streams********");
         
         Stream<String> namesStream = names.stream();
         namesStream.forEach(System.out::println);
         System.out.println("--------");
         
         names.forEach(name -> System.out.println(name));
         System.out.println("--------");
         
         List<String> list2 = names.stream().filter(s->s.startsWith("M") || s.startsWith("V")).collect(Collectors.toList());
         System.out.println(list2);
    	

         
         
       /* List<String> names = Arrays.asList("Java8", "Lambdas", "In", "Action");
        Stream<String> s = names.stream();
        s.forEach(System.out::println);
        // uncommenting this line will result in an IllegalStateException
        // because streams can be consumed only once
        //s.forEach(System.out::println); */
    }
}