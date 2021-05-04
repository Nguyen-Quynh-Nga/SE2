package Mankind;

public class Student extends Human{
	private String facultyNumber;
	public Student(String firstName, String lastName, String facultyNumber) {
		super(firstName, lastName);
		this.facultyNumber= facultyNumber;
	}
	public String getFacultyNumber() {
		return facultyNumber;
	}
	public void setFacultyNumber(String facultyNumber) throws IllegalArgumentException {
		if(facultyNumber.length()>=10 && facultyNumber.length()<=5) {
			throw new IllegalArgumentException("Invalid faculty number!");
			
		}
			
		
		this.facultyNumber = facultyNumber;
	}
	
	@Override
    public void setLastName(String lastName){
         if(lastName.length() < 3){
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");

        }
         super.setLastName(lastName);
    }
	
	

}
