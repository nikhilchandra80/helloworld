public class helloworld2 {
	
	// Program specifying search criteria using Lambda functions.

    public enum gender {
        MALE, FEMALE
    }

    public String name;
    public int age;
    public LocalDate birthday;
    public Sex gender;
    public String emailAddress;

    public int getAge() {
    	return age;
    }

   
    printPersons(
    	    roster,
    	    (helloworld2 h) -> h.getGender() == Helloworld2.Sex.MALE
    	        && h.getAge() >= 18
    	        && h.getAge() <= 25
    	);
    
    
}
