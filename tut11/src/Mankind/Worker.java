package Mankind;

public class Worker extends Human {
	private double salary;
	private double workingHour;
	public Worker(String firstName, String lastName, double salary, double workingHour) {
		super(firstName,lastName );
		this.salary=salary;
		this.workingHour=workingHour;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) throws IllegalArgumentException {
		if(salary<10) {
			throw new IllegalArgumentException("\"Expected value mismatch!Argument:\r\n"
					+ "\r\n"
					+ "weekSalary\"");
		}
		this.salary = salary;
	}
	public double getWorkingHour() {
		return workingHour;
	}
	public void setWorkingHour(double workingHour) throws IllegalArgumentException {
		if(workingHour<1&& workingHour>12) {
			throw new IllegalArgumentException("\"Expected value mismatch!Argument:\r\n"
					+ "\r\n"
					+ "workHoursPerDay\"");
		}
		this.workingHour = workingHour;
	}
	

}
