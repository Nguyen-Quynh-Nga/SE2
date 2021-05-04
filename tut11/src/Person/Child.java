package Person;

public class Child extends Person{
	public Child(String name, int age){
		super(name, age);
		}
	@Override
	public void setAge(int age) throws IllegalArgumentException {
	//TODO: Validate the age
		if(age>15) {
			throw new IllegalArgumentException("Age must be less than 15");
		}
	super.setAge(age);
	}

}
