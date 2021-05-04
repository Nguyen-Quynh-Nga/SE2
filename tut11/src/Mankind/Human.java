package Mankind;
import static java.lang.Character.isUpperCase;

public class Human {
	private String firstName;
	private String lastName;
	public Human(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
        if(!isUpperCase(firstName.charAt(0))){
            throw new IllegalArgumentException("Expected upper case letter!Argument:firstName");
        }else{
            this.firstName = firstName;
        }
        
    }
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) throws IllegalArgumentException{
		if(lastName.length()<3)  {
			throw new IllegalArgumentException("Expected length at least 3");
		}
			this.lastName = lastName;
	}
}
	
	
	
	


