
public class HelloWorld {
public static void main(String args[]){
	
	List features = Arrays.asList("nikhil", "chandra", "hello ", "world");
	features.forEach(n -> System.out.println(n));

	features.forEach(System.out::println);
}
}
