
public class HelloWorld {
public static void main(String args[]){
	
	// This program is to illustrate iteration feature using lambda functions(Java 8)
	
	
	List features = Arrays.asList("nikhil", "chandra", "hello ", "world");
	features.forEach(n -> System.out.println(n));

	features.forEach(System.out::println);
}
}
